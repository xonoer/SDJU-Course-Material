package simplefactory;

public class Client {

	public static void main(String[] args) {
		Shape shape;
		String type = XMLUtil.getShapeType();
		try {
			shape = ShapeFactory.getShape(type);
			shape.draw();
			shape.erase();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
