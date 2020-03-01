//designpatterns.bridge.ImageImp.java
package designpatterns.bridge;

//抽象操作系统实现类，充当实现类接口
public interface ImageImp {
	public void doPaint(Matrix m);  //显示像素矩阵m
}
