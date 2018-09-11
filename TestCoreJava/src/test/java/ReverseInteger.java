package src.test.java;

import java.util.Scanner;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the integer to reverse : ");
		int originalInteger = scanner.nextInt();
		boolean flag = true;
		while(flag)	
		{
			if(originalInteger != 0)
			{
				if(originalInteger %10 > 0)
				{
					System.out.print(originalInteger%10);
					originalInteger = originalInteger/10;
				}
				else
					originalInteger = originalInteger/10;
				
			}
			else
				flag = false;
		}
	}

}
