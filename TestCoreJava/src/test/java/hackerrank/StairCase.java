package src.test.java.hackerrank;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.SyntaxTreeNode;

public class StairCase {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numInputs = scanner.nextInt();
		scanner.close();
		
		for(int i=1; i<=numInputs; i++)
		{
			int j = numInputs;
			
			while(j-- > i)
				System.out.print(" ");
			
			while(j-- >=0)
				System.out.print("#");
			System.out.println();
		}
	}
}
