//designpatterns.state.screen.NormalState.java
package designpatterns.state.screen;

//正常状态类：具体状态类
public class NormalState extends ScreenState{
	public void display() {
		System.out.println("正常大小！");
	}
}