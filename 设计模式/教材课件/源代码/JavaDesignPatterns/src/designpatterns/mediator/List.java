//designpatterns.mediator.List.java
package designpatterns.mediator;

//列表框类：具体同事类
public class List extends Component {
	public void update() {
		System.out.println("列表框增加一项：张无忌。");
	}
	
	public void select() {
		System.out.println("列表框选中项：小龙女。");
	}
}
