package src.test.java;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String to reverse it :");
		String inputString  = scanner.nextLine();
		
		String reverseString = "";
		
		for(int i=inputString.length()-1; i>=0; i--)
		{
			reverseString = reverseString + inputString.charAt(i);
		}
		
		System.out.println("Original String : " + inputString + "\nReversed String : " + reverseString );
		
	}
	

}
