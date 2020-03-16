package adapter;
import javax.xml.parsers.*;
import java.io.*;
import org.w3c.dom.*;
public class XMLUtil {
	public static Object getBean(String s) {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new File("E:\\eclipse-workspace3\\homework\\src\\adapter\\adapter.xml"));
			
			NodeList nl = doc.getElementsByTagName("className");
			Node n =  null;
			if(s.equalsIgnoreCase("dog")) 
				n = nl.item(0).getFirstChild();
			else if(s.equalsIgnoreCase("cat"))
				n = nl.item(1).getFirstChild();
			String cName = n.getNodeValue();
			
			Class c = Class.forName(cName);
			Object obj = c.getDeclaredConstructor().newInstance();
			return obj;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
