package covariant.returntype;

public class MainClass {
	
	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.display();
		
		Base base = new Base();
		base.display();
		
	}
}

class Base {
	
	public void display()
	{
		System.out.println("I am base");
		//return 1;
	}
}

class Derived extends Base
{
	public void disply()
	{
		System.out.println("I am derived");
		//return 1l;
	}
}