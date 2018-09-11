package src.test.java.designpatterns.creational;

public class BillPughSingleton {
	
	private BillPughSingleton()
	{
		
	}

	private static class SingletonHelper
	{
		private static final BillPughSingleton INSTANE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.INSTANE;
	}
	
	public static void main(String[] args) {
		
		BillPughSingleton.getInstance();
	}
}
