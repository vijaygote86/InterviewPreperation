package src.test.java;

import java.util.Arrays;

public class SortBinaryArray {
	
	public static void main(String[] args) {
		
		
		int A[] = {0,1,0,0,0,1,1,1,0,0,0,0,1,0,1};
		int sum = 0;
		for(int i=0; i<A.length; i++)
		{
			sum = sum + A[i];
		}
		
		System.out.println(sum);
		
		Arrays.fill(A, A.length-sum, A.length, 1);
		Arrays.fill(A, 0, A.length-sum, 0);
		
		
		
		System.out.println(Arrays.toString(A));
	}

}
