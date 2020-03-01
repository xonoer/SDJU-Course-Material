//designpatterns.proxy.Client.java
package designpatterns.proxy;

public class Client {
	public static void main(String args[]) {
		Searcher searcher;  //针对抽象编程，客户端无须分辨真实主题类和代理类
		searcher = (Searcher)XMLUtil.getBean();
		String result = searcher.doSearch("杨过","玉女心经");
	}
}
