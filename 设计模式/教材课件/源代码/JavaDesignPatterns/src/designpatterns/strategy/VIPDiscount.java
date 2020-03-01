//designpatterns.strategy.VIPDiscount.java
package designpatterns.strategy;

//VIP会员票折扣类：具体策略类
public class VIPDiscount implements Discount {
	private final double DISCOUNT = 0.5;
	public double calculate(double price) {
		System.out.println("VIP票：");
		System.out.println("增加积分！");
		return price * DISCOUNT;
	}
}