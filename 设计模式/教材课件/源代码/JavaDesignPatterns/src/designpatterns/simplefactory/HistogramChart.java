//designpatterns.simplefactory.HistogramChart.java
package designpatterns.simplefactory;

//柱状图类，充当具体产品类
public class HistogramChart implements Chart {
	public HistogramChart() {
		System.out.println("创建柱状图！");
	}
	
	public void display() {
		System.out.println("显示柱状图！");
	}
}