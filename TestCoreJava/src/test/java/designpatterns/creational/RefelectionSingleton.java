package src.test.java.designpatterns.creational;

import java.lang.reflect.Constructor;

public class RefelectionSingleton 
{
	
	public static void main(String[] args) 
	{
		EagerInitializationSingleton instanceOne = EagerInitializationSingleton.getInstance();
		
		EagerInitializationSingleton instanceTwo = null;
		
		try {
			Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
			
			for(Constructor constructor : constructors)
			{
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializationSingleton)constructor.newInstance();
				break;
			}
			System.out.println(instanceOne.hashCode());
			System.out.println(instanceTwo.hashCode());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
