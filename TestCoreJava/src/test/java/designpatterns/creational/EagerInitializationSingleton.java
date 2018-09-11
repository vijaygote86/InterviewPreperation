package src.test.java.designpatterns.creational;

public class EagerInitializationSingleton 
{

	private static final EagerInitializationSingleton INSTANCE = 
			new EagerInitializationSingleton();
	
	private EagerInitializationSingleton()
	{
		
	}
	
	public static EagerInitializationSingleton getInstance()
	{
		return INSTANCE;
	}
}
