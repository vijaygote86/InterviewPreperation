package src.test.java.designpatterns.factory;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("Circle");
		shape.draw();
		
		shape = factory.getShape("Triangle");
		shape.draw();
	}
}
