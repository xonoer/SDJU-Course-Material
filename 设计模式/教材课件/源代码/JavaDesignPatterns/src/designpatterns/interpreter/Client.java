//designpatterns.interpreter.Client.java
package designpatterns.interpreter;

public class Client {
	public static void main(String args[]) {
		String instruction = "down run 10 and left move 20";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		String outString;
		outString = handler.output();
		System.out.println(outString);
	}
}
