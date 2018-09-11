package src.test.java.designpatterns.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator
{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	public void draw()
	{
		decoratedShape.draw();
		setBorder(decoratedShape);
	}
	
	public void setBorder(Shape decoratedShape)
	{
		System.out.println("Border : RED");
	}
}
