package com.structural.facde;

public class ShapeMaker {
	
	Circle circle;
	Triangle triangle;
	Rectangle rectangle;
	
	public ShapeMaker()
	{
		circle = new Circle();
		triangle = new Triangle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle()
	{
		circle.draw();
	}

	public void drawRectanle()
	{
		rectangle.draw();
	}
	
	public void drawTriangle()
	{
		triangle.draw();
	}
}
