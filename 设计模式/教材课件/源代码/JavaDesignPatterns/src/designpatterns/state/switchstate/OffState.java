//designpatterns.state.switchstate.OffState.java
package designpatterns.state.switchstate;

//关闭状态类
public class OffState extends SwitchState{
	public void on(Switch s) {
		System.out.println("打开！");
		s.setState(Switch.getState("on"));
	}
	
	public void off(Switch s) {
		System.out.println("已经关闭！");
	}
}