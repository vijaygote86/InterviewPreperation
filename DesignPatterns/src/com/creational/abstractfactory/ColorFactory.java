package com.creational.abstractfactory;

public class ColorFactory extends AbstractShapeColorFactory{

	@Override
	Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String colorType) {
		
		if(colorType == null)
			return null;
		else if(colorType == "Green")
			return new GreenColor();
		else if(colorType == "Red")
			return new RedColor();
		else if(colorType == "Blue")
			return new BlueColor();
		else
			return null;
	}
}
