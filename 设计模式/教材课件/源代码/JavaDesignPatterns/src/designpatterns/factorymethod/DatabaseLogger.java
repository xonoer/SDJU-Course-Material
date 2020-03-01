//designpatterns.factorymethod.DatabaseLogger.java
package designpatterns.factorymethod;

//数据库日志记录器，充当具体产品角色
public class DatabaseLogger implements Logger {
	public void writeLog() {
		System.out.println("数据库日志记录。");
	}
}
