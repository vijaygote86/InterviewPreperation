package com.behavior.strategy;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strat)
	{
		this.strategy = strat;
	}
	
	public int execute(int num1, int num2)
	{
		return strategy.doOperation(num1, num2);
	}

}
