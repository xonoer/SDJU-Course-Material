//designpatterns.factorymethod.LoggerFactory.java
package designpatterns.factorymethod;

//日志记录器工厂接口，充当抽象工厂角色
public interface LoggerFactory {
	public Logger createLogger(); //抽象工厂方法
}
