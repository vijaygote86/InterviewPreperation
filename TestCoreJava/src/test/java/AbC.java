package src.test.java;

import java.util.Random;

public class AbC  implements InterfaceTest{
	
	public static void main(String[] args) {
		for(int i=0 ;i<100;i++)
		{
		long aStart = 1000000000;
		long aEnd =9999999999L;
		Random random = new Random();
		
		long range = aEnd - (long)aStart + 1;
	    long fraction = (long)(range * random.nextDouble());
	    long randomNumber =  fraction + (long)aStart;    
	   System.out.println("Generated : " + randomNumber);
	   
	   InterfaceTest 
	}}
}
