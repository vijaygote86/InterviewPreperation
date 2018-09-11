package src.test.java.nulltest;

public class NullTest {
	
	public void display(Parent p)
	{
		System.out.println("Im parent");
	}
	
	public void display(Child c)
	{
		System.out.println("Im child");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
		NullTest nullTest = new NullTest();
		nullTest.display(null);
	}

}
