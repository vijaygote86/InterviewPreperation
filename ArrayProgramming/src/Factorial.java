
public class Factorial {
	
	public int fact(int n)
	{
		int fact = n;
		if(fact == 1)
			return fact;
		else
			fact =  fact * fact(fact-1);
		return fact;
	}
	
	public static void main(String[] args) {
		
		Factorial f= new Factorial();
		System.out.println(f.fact(4));
	}

}
