package src.test.java.hackerrank;

import com.sun.java_cup.internal.runtime.Scanner;

public class DigonalDifference {
	
	public static void main(String[] args) {
		
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		int a[][] = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n ; j++)
				a[i][j] = scanner.nextInt();
		}
		
		int result = DigonalDifference.findDigDiff(a);
		System.out.println(result);
	}
	
	public static int findDigDiff(int[][] a)
	{
		int length = a.length;
		int leftDigSum = 0;
		int rightDigSum = 0;
		
		int index = 0;
		while(index <length)
		{
			leftDigSum = leftDigSum + a[index][index];
			rightDigSum = rightDigSum + a[index][length-1-index];
			index++;
		}
		
		return Math.abs(leftDigSum-rightDigSum);
	}

	
}
