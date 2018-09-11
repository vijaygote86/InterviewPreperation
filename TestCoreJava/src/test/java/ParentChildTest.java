package src.test.java;

public class ParentChildTest {
	
	class Parent
	{
		public void display()
		{
			System.out.println("I am in Parent");
		}
	}
	
	class Child extends Parent
	{
		public void display()
		{
			System.out.println("I am in Child");
		}
	}

	public static void main(String[] args) {
		
		ParentChildTest test = new ParentChildTest();
		
		Parent p = test.new Child();
		p.display();
	}
}
