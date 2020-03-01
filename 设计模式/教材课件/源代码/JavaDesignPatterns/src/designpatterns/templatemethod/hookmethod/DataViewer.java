//designpatterns.templatemethod.hookmethod.DataViewer.java
package designpatterns.templatemethod.hookmethod;

public abstract class DataViewer {
	//抽象方法：获取数据
	public abstract void getData();
	
    //具体方法：转换数据
    public void convertData() {
		System.out.println("将数据转换为XML格式。");
	}
	
    //抽象方法：显示数据
	public abstract void displayData();
	
	//钩子方法：判断是否为XML格式的数据
	public boolean isNotXMLData() {
    	return true;
    }
    
    //模板方法
    public void process() {
        getData();
        //如果不是XML格式的数据则进行数据转换
        if (isNotXMLData()) {
            convertData();	
        }
   	    displayData();
    }
}