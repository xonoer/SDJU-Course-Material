//designpatterns.state.switchstate.Switch.java
package designpatterns.state.switchstate;

public class Switch {
	private static SwitchState currentState,onState,offState; //定义三个静态的状态对象
	private String name;
	
	public Switch(String name) {
		this.name = name;
		onState = new OnState();
		offState = new OffState();
		currentState = onState;
	}

	public void setState(SwitchState state) {
		currentState = state;
	}

	public static SwitchState getState(String type) {
		if (type.equalsIgnoreCase("on")) {
			return onState;
		}
		else {
			return offState;
		}
	}
		
    //打开开关
	public void on() {
		System.out.print(name);
		currentState.on(this);
	}
	
	//关闭开关
	public void off() {
		System.out.print(name);
		currentState.off(this);
	}
}
