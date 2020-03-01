//designpatterns.observer.Client.java
package designpatterns.observer;

public class Client {
	public static void main(String args[]) {
		//定义观察目标对象
		AllyControlCenter acc;
		acc = new ConcreteAllyControlCenter("金庸群侠");
		
        //定义四个观察者对象
		Observer player1,player2,player3,player4;
		
		player1 = new Player("杨过");
		acc.join(player1);
		
		player2 = new Player("令狐冲");
		acc.join(player2);
		
		player3 = new Player("张无忌");
		acc.join(player3);
		
		player4 = new Player("段誉");
		acc.join(player4);
		
		//某成员遭受攻击
		player1.beAttacked(acc);
	}
}
