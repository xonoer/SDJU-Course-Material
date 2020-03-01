//designpatterns.bridge.GIFImage.java
package designpatterns.bridge;

//GIF格式图像类，充当扩充抽象类
public class GIFImage extends Image {
	public void parseFile(String fileName) {
      //模拟解析GIF文件并获得一个像素矩阵对象m;
      Matrix m = new Matrix(); 
      imp.doPaint(m);
      System.out.println(fileName + "，格式为GIF。");
  }
}