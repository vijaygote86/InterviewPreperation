package com.creational.abstractfactory;

public class FactoryProducer {
	
	public static AbstractShapeColorFactory getFactory(String choice)
	{
		if(choice == "Shape")
			return new ShapeFactory();
		else if(choice == "Color")
			return  new ColorFactory();
		else 
			return null;
	}

}
