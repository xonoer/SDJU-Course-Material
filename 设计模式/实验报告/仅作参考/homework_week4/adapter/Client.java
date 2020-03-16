package adapter;

public class Client {
	public static void main(String[] args) {
		Icat cat = new Adapter((Icat)XMLUtil.getBean("cat"));
		Idog dog = new Adapter((Idog)XMLUtil.getBean("dog"));
		
		cat.catchMouse();
		cat.catCry();
		
		dog.catchSth();
		dog.dogCry();
		
	}
}
