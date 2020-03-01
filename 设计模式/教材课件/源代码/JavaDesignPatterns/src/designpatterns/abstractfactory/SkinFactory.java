//designpatterns.abstractfactory.SkinFactory.java
package designpatterns.abstractfactory;

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}