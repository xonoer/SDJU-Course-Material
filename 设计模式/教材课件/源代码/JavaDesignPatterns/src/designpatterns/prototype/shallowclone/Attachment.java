//designpatterns.prototype.shallowclone.Attachment.java
package designpatterns.prototype.shallowclone;

public class Attachment {
	private String name; //附件名

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

    public void download() {
    	System.out.println("下载附件，文件名为" + name);	
    }
}