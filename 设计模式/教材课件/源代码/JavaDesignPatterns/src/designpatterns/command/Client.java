//designpatterns.command.Client.java
package designpatterns.command;

public class Client {
	public static void main(String args[]) {
		FunctionButton fb = new FunctionButton();
		Command command; //定义命令对象
		command = (Command)XMLUtil.getBean(); //读取配置文件，反射生成对象
		
		fb.setCommand(command); //将命令对象注入功能键
		fb.click(); //调用功能键的业务方法
	}
}