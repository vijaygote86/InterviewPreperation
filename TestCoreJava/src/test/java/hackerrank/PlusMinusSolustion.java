package src.test.java.hackerrank;

import java.util.Scanner;

public class PlusMinusSolustion {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];
		for(int i=0; i<length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		plusMinus(arr);
	}
	
	public static void plusMinus(int[] a)
	{
		int posCounter = 0;
		int negCounter = 0;
		int zeroCounter = 0;
		int length = a.length;
		
		for(int i=0; i<length; i++)
		{
			if(a[i]>0)
				posCounter++;
			if(a[i]<0)
				negCounter++;
			if(a[i]==0)
				zeroCounter++;
		}
		System.out.println("Posistive :" + posCounter/length);
		System.out.println("Negative :" + negCounter/length);
		System.out.println("Zero :" + zeroCounter/length);
	}

}
