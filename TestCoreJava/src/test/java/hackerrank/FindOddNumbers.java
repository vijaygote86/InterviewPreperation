package src.test.java.hackerrank;

import java.util.Scanner;

public class FindOddNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number :");
		int l = scanner.nextInt();

		System.out.print("Enter second number :");
		int r = scanner.nextInt();


		int[] a = {2,3,10,2,4,8,1};
		findAllOdnumbers(a);


	}

	public static void findAllOdnumbers(int[] a)
	{

		int arr[] = new int[10];
		int k=0;
		for(int j=1; j<a.length; j++)
		{
			int num = a[j];
			for(int i=0; i<j; i++)
			{
				if(num > a[i])
				{	
					arr[k] = num-a[i];
					k++;
				}
			}
		}
		String[] abc = new String[1];
		abc[0] = '"
		int temp =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > temp)
				temp = arr[i];
		}
		
		System.out.println(temp);
	}

}

