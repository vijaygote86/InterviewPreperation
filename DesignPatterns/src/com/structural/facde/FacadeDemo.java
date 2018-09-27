package com.structural.facde;

public class FacadeDemo {
	
	public static void main(String[] args) throws ArithmeticException {
		
		int y = 1/0;
		
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectanle();
		shapeMaker.drawTriangle();
	}
}
