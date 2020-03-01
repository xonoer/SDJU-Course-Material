//designpatterns.strategy.Client.java
package designpatterns.strategy;

public class Client {
	public static void main(String args[]) {
		MovieTicket mt = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		
		mt.setPrice(originalPrice);
		System.out.println("原始价为：" + originalPrice);
		System.out.println("---------------------------------");
			
		Discount discount;
		discount = (Discount)XMLUtil.getBean(); //读取配置文件并反射生成具体折扣对象
		mt.setDiscount(discount); //注入折扣对象
		
		currentPrice = mt.getPrice();
		System.out.println("折后价为：" + currentPrice);
	}
}
