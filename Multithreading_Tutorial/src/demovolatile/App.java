package demovolatile;

import java.util.Scanner;

class Runner extends Thread
{
	private volatile boolean running = true;
	
	public void run()
	{
		while(running)
		{
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown()
	{
		running = false;
	}
	
	
}

public class App {
	
	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.start();
		
		System.out.println("Press enter key to stop thread....");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine(); 
		
		runner.shutdown();
		
	}

}
