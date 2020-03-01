//designpatterns.adapter.PoliceCarAdapter.java
package designpatterns.adapter;

//警车适配器，充当适配器
public class PoliceCarAdapter extends CarController {
	private PoliceSound sound;  //定义适配者PoliceSound对象
	private PoliceLamp lamp;   //定义适配者PoliceLamp对象
	
	public PoliceCarAdapter() {
		sound = new PoliceSound();
		lamp = new PoliceLamp();
	}
	
	//发出警笛声音
	public void phonate() {
		sound.alarmSound();  //调用适配者类PoliceSound的方法
	}
	
	//呈现警灯闪烁
	public void twinkle() {
		lamp.alarmLamp();   //调用适配者类PoliceLamp的方法
	}
}