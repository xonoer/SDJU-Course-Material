//designpatterns.mediator.Client.java
package designpatterns.mediator;

public class Client {
	public static void main(String args[]) {
		/*
        //定义中介者对象
		ConcreteMediator mediator;
		mediator = new ConcreteMediator();
		
        //定义同事对象
		Button addBT = new Button();
		List list = new List();
	    ComboBox cb = new ComboBox();
	    TextBox userNameTB = new TextBox();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);

		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;
		
		addBT.changed();
		System.out.println("-----------------------------");
		list.changed();
		*/
	    //用新增具体中介者定义中介者对象
		SubConcreteMediator mediator;
		mediator = new SubConcreteMediator();
		
		Button addBT = new Button();
		List list = new List();
		ComboBox cb = new ComboBox();
		TextBox userNameTB = new TextBox();
		Label label = new Label();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);
		label.setMediator(mediator);
			
		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;
		mediator.label = label;
				
		addBT.changed();
		System.out.println("-----------------------------");
		list.changed();
	}
}
