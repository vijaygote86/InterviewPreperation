
public class TestDemo {
	{
		System.out.println("This is TestDemo");
	}
	static double d =(1/2);
	public static void main(String[] args) {
		
		TestDemo2 demo2  = new TestDemo2();
		System.out.println(TestDemo.d);
	}
}

class TestDemo1 extends TestDemo
{
	{
		System.out.println("This is TestDemo1");
	}
}

class TestDemo2 extends TestDemo1
{
	{
		System.out.println("This is TestDemo2");
	}
}

