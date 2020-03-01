//designpatterns.adapter.CarController.java
package designpatterns.adapter;

//汽车控制类，充当目标抽象类
public abstract class CarController {
	public void move() {
		System.out.println("玩具汽车移动！");
	}
	
	public abstract void phonate(); //发出声音
	public abstract void twinkle(); //灯光闪烁
}