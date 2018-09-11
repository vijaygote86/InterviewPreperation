
public class RecurFactorial {
	
	static int fact = 1;
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n)
	{
		if(n!=0)
			return n*factorial(n-1);
		else return 1;
	}

}
