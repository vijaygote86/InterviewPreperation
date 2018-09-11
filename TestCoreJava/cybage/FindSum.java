package cybage;

public class FindSum {
	
	public static void sum(int x, int n,int m)
	{
		int[] arr = new int[m];
		arr[0] = x;
		for(int i=1; i<=m; i++)
		{
			arr[i]= power(x, (i+n));
			
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int power(int base, int powerRaised)
	{
		if(powerRaised != 0)
		{
			return (base * power(base, powerRaised-1));
		}
		else
			return 1;	
	}
	
	public static void main(String[] args) {
		
		FindSum.sum(2, 1, 6);
	}

}
