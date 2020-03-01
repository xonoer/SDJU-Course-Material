//designpatterns.bridge.Image.java
package designpatterns.bridge;

//抽象图像类，充当抽象类
public abstract class Image {
	protected ImageImp imp;

    //注入实现类接口对象
	public void setImageImp(ImageImp imp) {
		this.imp = imp;
	} 

	public abstract void parseFile(String fileName);
}