//designpatterns.command.HelpCommand.java
package designpatterns.command;

public class HelpCommand extends Command{
	private DisplayHelpClass hcObj;   //维持对请求接收者的引用
	
	public HelpCommand() {
		hcObj = new DisplayHelpClass();
	}

	//命令执行方法，将调用请求接收者的业务方法
	public void execute() {
		hcObj.display();
	}
}
