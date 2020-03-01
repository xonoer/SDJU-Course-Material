//designpatterns.command.ExitCommand.java
package designpatterns.command;

public class ExitCommand extends Command{
	private SystemExitClass seObj;  //维持对请求接收者的引用
	
	public ExitCommand() {
		seObj = new SystemExitClass();
	}
	
	//命令执行方法，将调用请求接收者的业务方法
	public void execute() {
		seObj.exit();
	}
}