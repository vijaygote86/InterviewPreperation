package src.test.java.designpatterns.structural.decorator;

public class DecoratorPatternDemo {
	
	public static void main(String[] args) {
		
		Shape circle = new Circle();
		circle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();
		
	}

}
