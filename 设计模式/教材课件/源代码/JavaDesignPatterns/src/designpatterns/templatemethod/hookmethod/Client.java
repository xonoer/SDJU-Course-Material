//designpatterns.templatemethod.hookmethod.Client.java
package designpatterns.templatemethod.hookmethod;

public class Client {
	public static void main(String args[]) {
		DataViewer dv;
		dv = new XMLDataViewer();
		dv.process();
	}
}
