package com.creational.abstractfactory;

public abstract class AbstractShapeColorFactory {
	
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String colorType);

}
