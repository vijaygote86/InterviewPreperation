package com.creational.factory;

public class ShapeFactoryDemo {
	
	public static void main(String[] args) {
		
		
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("Rectangle");
		shape.draw();
		
		shape = factory.getShape("Triangle");
		shape.draw();
		
		shape = factory.getShape("Circle");
		shape.draw();
	}

}
