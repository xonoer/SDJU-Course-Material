//designpatterns.prototype.deepclone.WeeklyLog.java
package designpatterns.prototype.deepclone;
import java.io.*;

public class WeeklyLog implements Serializable {
	private Attachment attachment;
	private String name;
	private String date;
	private String content;

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setDate(String date) {
		this.date = date; 
	}

	public void setContent(String content) {
		this.content = content; 
	}

	public Attachment getAttachment() {
		return (this.attachment);
	}

	public String getName() {
		return (this.name); 
	}

	public String getDate() {
		return (this.date); 
	}

	public String getContent() {
		return (this.content); 
	}

	//使用序列化技术实现深克隆
	public WeeklyLog deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
		//将对象写入流中
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//将对象从流中取出
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (WeeklyLog)ois.readObject();
	}
}