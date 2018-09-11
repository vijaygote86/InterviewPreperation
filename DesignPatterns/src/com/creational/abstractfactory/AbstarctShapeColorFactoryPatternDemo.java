package com.creational.abstractfactory;

public class AbstarctShapeColorFactoryPatternDemo {
	
	public static void main(String[] args) {
		
		AbstractShapeColorFactory shapefactory = FactoryProducer.getFactory("Shape");
		AbstractShapeColorFactory colorFactory = FactoryProducer.getFactory("Color");
		
		Shape shape = shapefactory.getShape("Circle");
		Color color = colorFactory.getColor("Red");
		shape.draw();
		color.applyColor();
	}

}
