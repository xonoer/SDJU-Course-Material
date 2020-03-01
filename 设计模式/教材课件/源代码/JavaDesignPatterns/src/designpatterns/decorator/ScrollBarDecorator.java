//designpatterns.decorator.ScrollBarDecorator.java
package designpatterns.decorator;

public class ScrollBarDecorator extends ComponentDecorator {
	public ScrollBarDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("为构件增加滚动条！");
	}
}