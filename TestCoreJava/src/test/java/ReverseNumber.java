package src.test.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean flag = true;
		while(flag){
			if(x!=0){
			if(x%10>0){
			System.out.print(x%10);
			x=x/10;
			}else{
				x=x/10;
			}
			
			}else{
				flag = false;
			}
		}
	}
}
