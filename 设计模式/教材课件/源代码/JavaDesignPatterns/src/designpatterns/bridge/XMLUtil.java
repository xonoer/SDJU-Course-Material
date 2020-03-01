//designpatterns.bridge.XMLUtil.java
package designpatterns.bridge;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
	//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String args) {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("src//designpatterns//bridge//config.xml")); 
			NodeList nl=null;
			Node classNode=null;
			String cName=null;
			nl = doc.getElementsByTagName("className");
			
			//获取第一个包含类名的结点，即扩充抽象类
			if(args.equals("image")) {
	            classNode=nl.item(0).getFirstChild();
	            
			}
			//获取第二个包含类名的结点，即具体实现类
			else if(args.equals("os")) {
	            classNode=nl.item(1).getFirstChild();
			}
			
	        cName=classNode.getNodeValue();
	        //通过类名生成实例对象并将其返回
	        Class c=Class.forName(cName);
		  	Object obj=c.newInstance();
	        return obj;		
        }   
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
	}
}