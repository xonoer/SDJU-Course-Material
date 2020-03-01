//designpatterns.proxy.dynamic.DAOLogHandler.java
package designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

//自定义请求处理程序类
public class DAOLogHandler implements InvocationHandler {
	private Calendar calendar;
	private Object object;
	
	public DAOLogHandler() {	
	}
	
	//自定义有参构造函数，用于注入一个需要提供代理的真实主题对象
	public DAOLogHandler(Object object) {
		this.object = object;
	}
	
	//实现invoke()方法，调用在真实主题类中定义的方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		beforeInvoke();
		Object result = method.invoke(object, args); //转发调用
		afterInvoke();
		return result;
	}

	//记录方法调用时间
	public void beforeInvoke(){
	  	calendar = new GregorianCalendar();
	  	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	  	int minute = calendar.get(Calendar.MINUTE);
	  	int second = calendar.get(Calendar.SECOND);
	  	String time = hour + ":" + minute + ":" + second;
	  	System.out.println("调用时间：" + time);
	}

	public void afterInvoke(){
		System.out.println("方法调用结束！" );
	}
}
