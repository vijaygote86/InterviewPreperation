
public class Polymorhphism {
	
	public void Test(Parent p)
	{
		System.out.println("I am parent");
	}
	
	public void Test(Child ch)
	{
		System.out.println("I am child");
	}
	
	public void Test(Parent1 p1)
	{
		System.out.println("I am Parent1");
	}
	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child ch = new Child();
		Parent1 p1 = new Parent1();

	}

}

class Parent
{
	public void test1()
	{
		
	}
}

class Parent1
{

}
class Child extends Parent
{
	public void test1()
	{
		
	}
}

