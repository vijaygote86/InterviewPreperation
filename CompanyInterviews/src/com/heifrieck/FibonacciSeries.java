package com.heifrieck;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		
		System.out.println(FibonacciSeries.findFibonacciPosition(5));
		
		FibonacciSeries.findFibonacci(20);
		
		
	}
	
	public static long findFibonacciPosition(int position)
	{
		long x=0;
		long y=1;
		long result = 0;
		
		for(int i=2; i<position; i++)
		{
			result = x+y;
			x= y;
			y= result;
		}
		
		return result; 
	}
	
	public static void findFibonacci(int position)
	{
		
		long[] array = new long[position];
		long x=0;
		long y=1;
		long result = 0;
		
		array[0] = x;
		array[1] = y;
		
		for(int i=2; i<position; i++)
		{
			
			array[i] = array[i-1]+array[i-2];
//			result = x+y;
//			x= y;
//			y= result;
		}
		
		for(int i=0; i<position; i++)
		{
			System.out.print(array[i] +", ");
		}
	}

}
