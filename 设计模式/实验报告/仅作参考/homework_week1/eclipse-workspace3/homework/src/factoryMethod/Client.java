package factoryMethod;

public class Client {

	public static void main(String[] args) {
		IImageFactory imageFactory= null;
		IImageReader imageReader = null;
		imageFactory = (IImageFactory)XMLUtil.getBean();
		imageReader = imageFactory.createReader();
		imageReader.read();
	}

}
