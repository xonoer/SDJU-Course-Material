package factoryMethod;

public class GifFactory implements IImageFactory {

	@Override
	public IImageReader createReader() {
		IImageReader iimageReader = null;
		iimageReader = new GifReader();
		return iimageReader;
	}

}
