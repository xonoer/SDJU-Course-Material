//designpatterns.state.screen.LargerState.java
package designpatterns.state.screen;

//二倍状态类：具体状态类
public class LargerState extends ScreenState{
	public void display() {
		System.out.println("二倍大小！");
	}
}
