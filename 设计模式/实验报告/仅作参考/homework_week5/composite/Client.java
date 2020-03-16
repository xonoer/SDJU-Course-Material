package composite;

public class Client {
	public static void main(String[] args) {
		HeadQuarters of1, of2, sd1, sd2, sd3, sd4;
		of1 = new Office("教务办公室");
		of2 = new Office("行政办公室");
		sd1 = new Subdepartment("北京总部");
		sd2 = new Subdepartment("湖南分校");
		sd3 = new Subdepartment("长沙教学点");
		sd4 = new Subdepartment("湘潭教学点");
		
		sd1.add(of1);
		sd1.add(of2);
		sd1.add(sd2);
		sd2.add(of1);
		sd2.add(of2);
		sd2.add(sd3);
		sd2.add(sd4);
		sd3.add(of1);
		sd3.add(of2);
		sd4.add(of1);
		sd4.add(of2);
		sd1.executeInstructions();
		
	}
}
