package factoryMethod;

public class JpgFactory implements IImageFactory{
	
	@Override
	public IImageReader createReader() {
		IImageReader iimageReader = null;
		iimageReader = new JpgReader();
		return iimageReader;
	}
}
