package com.tomtom;

public class FirstProgram {
	
	
	public static void main(String[] args) {
		
		FirstProgram p = new FirstProgram();
		int[] arr = new int[]{12,10,8,13,20,1,18,7,3};
		int k = 3;
		int l = 2;
		System.out.println(p.findMaxSum(arr, k, l));
		
	}
	
	int findMaxSum(int[] arr, int k, int l)
	{
		int alexFinalSum = 0;
		int bobSum = 0;
		int sum=0;
		
		int alexStartIndex = 0;
		int alexEndIndex  = 0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			
			int j=i;
			int counter = 0;
			sum =0;
			while(counter<3 && j<arr.length)
			{
				sum = sum + arr[j];
				if(sum>alexFinalSum)
				{
					alexStartIndex = i;
					alexEndIndex = j;
					alexFinalSum = sum;
				}
				j++;
				counter++;
			}
		}
		
		for(int i=0; i<arr.length-1; i++)
		{
			
			int j=i;
			int counter = 0;
			sum =0;
			
			while(counter<2 && j<arr.length )
			{
				
				if(!(j>alexStartIndex && j<alexEndIndex))
				{
					sum = sum + arr[j];
					if(sum>bobSum)
					{
						bobSum = sum;
					}
				}
				j++;
				counter++;
			}
		}
		return alexFinalSum+bobSum;
	}
}
