//designpatterns.state.switchstate.Client.java
package designpatterns.state.switchstate;

public class Client {
	public static void main(String args[]) {
		Switch s1,s2;
		s1=new Switch("开关1");
		s2=new Switch("开关2");
		
		s1.on();
		s2.on();
		s1.off();
		s2.off();
		s2.on();
		s1.on();	
	}
}
