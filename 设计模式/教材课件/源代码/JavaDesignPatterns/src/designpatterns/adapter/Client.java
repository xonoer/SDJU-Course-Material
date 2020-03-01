//designpatterns.adapter.Client.java
package designpatterns.adapter;

public class Client {
	public static void main(String args[]) {
		CarController car ;
		car = (CarController)XMLUtil.getBean();
		car.move();
		car.phonate();
		car.twinkle();
	}
}