package com.creational.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapeType)
	{
		
		if(shapeType == null)
			return null;
		if(shapeType == "Triangle")
		{
			return new Triangle();
		}
		else if(shapeType == "Rectangle")
			return new Rectangle();
		else if(shapeType == "Circle")
			return new Circle();
		else return null;
	}

}
