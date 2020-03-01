//designpatterns.strategy.ChildrenDiscount.java
package designpatterns.strategy;

//¶ùÍ¯Æ±ÕÛ¿ÛÀà£º¾ßÌå²ßÂÔÀà
public class ChildrenDiscount implements Discount {
	private final double DISCOUNT = 10;
	public double calculate(double price) {
		System.out.println("¶ùÍ¯Æ±£º");
		if(price>=20) {
			return price - DISCOUNT;
		}
		else {
			return price;
		}
	}
} 