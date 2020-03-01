//designpatterns.state.switchstate.OnState.java
package designpatterns.state.switchstate;

//打开状态类
public class OnState extends SwitchState{
	public void on(Switch s) {
		System.out.println("已经打开！");
	}
	
	public void off(Switch s) {
		System.out.println("关闭！");
		s.setState(Switch.getState("off"));
	}
}
