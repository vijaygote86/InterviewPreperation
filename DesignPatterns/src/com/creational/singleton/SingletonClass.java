package com.creational.singleton;

public class SingletonClass {
	
	private SingletonClass instance_= null;
	
	private SingletonClass()
	{
		
	}
	
	public SingletonClass getInstance()
	{
		if(instance_ == null)
		{
			synchronized (SingletonClass.class) {
				
				if(instance_ == null)
				{
					instance_ = new SingletonClass();
				}
				
			}
		}
		return instance_;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}

}
