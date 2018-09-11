package com.behavior.strategy;

public class StartegyDemo {
	
	
	
	public static void main(String[] args) {
		
		Context ctx = new Context(new AddOperation());
		System.out.println("Addition is : "+ctx.execute(10, 10));
		
		ctx = new Context(new MultiplyOperation());
		System.out.println("Multiplication is : " +ctx.execute(10, 10));
		
	}
	
	

}
