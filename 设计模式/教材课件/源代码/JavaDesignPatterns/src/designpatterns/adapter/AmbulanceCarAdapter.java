//designpatterns.adapter.AmbulanceCarAdapter.java
package designpatterns.adapter;

//救护车适配器，充当适配器
public class AmbulanceCarAdapter extends CarController {
	private AmbulanceSound sound;  //定义适配者AmbulanceSound对象
	private AmbulanceLamp lamp;    //定义适配者AmbulanceLamp对象
	
	public AmbulanceCarAdapter() {
		sound = new AmbulanceSound();
		lamp = new AmbulanceLamp();
	}
	
	//发出救护车声音
	public void phonate() {
		sound.alarmSound();  //调用适配者类AmbulanceSound的方法
	}
	
	//呈现救护车灯闪烁
	public void twinkle() {
		lamp.alarmLamp();   //调用适配者类AmbulanceLamp的方法
	}
}