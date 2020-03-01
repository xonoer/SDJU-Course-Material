//designpatterns.prototype.deepclone.Client.java
package designpatterns.prototype.deepclone;

public class Client {
	public static void main(String args[]) {
		WeeklyLog log_previous, log_new = null;
		log_previous = new WeeklyLog();           //创建原型对象
		Attachment attachment = new Attachment();   //创建附件对象
		log_previous.setAttachment(attachment);     //将附件添加到周报中
		try {
			log_new = log_previous.deepClone(); //调用深克隆方法创建克隆对象		
		}
		catch(Exception e) {
			System.err.println("克隆失败！");
		}
		//比较周报
		System.out.println("周报是否相同？ " + (log_previous == log_new));
		//比较附件
		System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
	}
}