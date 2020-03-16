package simplefactory;

public class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("绘制三角形");

	}

	@Override
	void erase() {
		System.out.println("擦除三角形");

	}

}
