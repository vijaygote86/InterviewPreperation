package src.test.java.hackerrank;

import java.util.Scanner;

public class Addition {
	
	public static int solveMefirst(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = solveMefirst(a, b);
		System.out.println("sum is : " +sum);
		
	}

}
