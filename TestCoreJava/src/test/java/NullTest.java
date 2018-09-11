package src.test.java;

public class NullTest {
	
	
//	public void display(int n)
//	{
//		System.out.println("I am Int");
//	}
//	
//	public void display(float f)
//	{
//		System.out.println("I am Float");
//	}
	
	public void display(Object o)
	{
		System.out.println("Im Object");
	}
	
	public void display(String s)
	{
		System.out.println("Im String");
	}
	
//	public void display(Task t)
//	{
//		System.out.println("Im Task");
//	}
	

	public static void main(String[] args) {
		
		NullTest nullTest = new NullTest();
		nullTest.display(null);
	}
}
