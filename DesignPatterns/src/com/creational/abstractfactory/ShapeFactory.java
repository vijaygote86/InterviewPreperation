package com.creational.abstractfactory;

public class ShapeFactory extends AbstractShapeColorFactory{

	@Override
	Shape getShape(String shapeType) {
		
		if(shapeType == null)
			return null;
		else if(shapeType == "Triangle")
			return new Triangle();
		else if(shapeType == "Circle")
			return new Circle();
		else if(shapeType == "Rectangle")
			return new Rectangle();
		else 
			return null;
	}

	@Override
	Color getColor(String colorType) {
		return null;
	}

}
