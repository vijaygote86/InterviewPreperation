package src.test.java.threading8;

import java.util.Scanner;

public class Processor {
	
	public void produce() throws InterruptedException
	{
		synchronized (this) {
			System.out.println("Producer thread is Runnig....");
			wait();
			System.out.println("Resumed....");
			
		}
	}
	
	public void consume() throws InterruptedException
	{
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(20000);
		
		synchronized (this) {
			
			System.out.println("Waiting for return key....");
			scanner.nextLine();
			System.out.println("Return key pressed.");
			notify();
		}
	}

}
