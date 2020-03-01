//designpatterns.visitor.ParttimeEmployee.java
package designpatterns.visitor;

//兼职员工类：具体元素类
public class ParttimeEmployee implements Employee {
	private String name; //员工姓名
	private double hourWage; //员工时薪
	private int workTime; //工作时间

	public ParttimeEmployee(String name,double hourWage,int workTime) {
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}	

	public void setName(String name) {
		this.name = name; 
	}

	public void setHourWage(double hourWage) {
		this.hourWage = hourWage; 
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime; 
	}

	public String getName() {
		return (this.name); 
	}

	public double getHourWage() {
		return (this.hourWage); 
	}

	public int getWorkTime() {
		return (this.workTime); 
	}

	public void accept(Department handler) {
		handler.visit(this); //调用访问者的访问方法
	}
}