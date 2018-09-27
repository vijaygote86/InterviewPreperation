package com.covariant.returntype;

public class A {
	
	A get()
	{
		return this;
	}
}

class B
{
	B get()
	{
		return this;
	}
	
	void message()
	{
		System.out.println("This is called covariant return type introduced in jdk1.5");
	}
}
