package demo1;

import java.util.Scanner;

public class ThreadDemo {
	
	public static void main(String args[])
	{
		Thread t = new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("Thread created.....");
			}
		});
		
		t.start();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to reverse...");
		int number = scanner.nextInt();
		
		boolean flag = true;
		
		while(flag)
		{
			if(number!=0)
			{
				if(number%10>0)
				{
					System.out.print(number%10);
					number = number/10;
				}
				else
				{
					number =number/10;
				}
			}
			else
			{
				flag=false;
			}
			
		}
	}

}
