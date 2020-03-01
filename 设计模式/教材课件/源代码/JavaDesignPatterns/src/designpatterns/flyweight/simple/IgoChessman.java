//designpatterns.flyweight.simple.IgoChessman.java
package designpatterns.flyweight.simple;

//围棋棋子类：抽象享元类
public abstract class IgoChessman {
	public abstract String getColor();

	public void display() {
		System.out.println("棋子颜色：" + this.getColor());	
	}
}
