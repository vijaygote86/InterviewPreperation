package src.test.java;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadNumberPrinter {
	
	Object monitor =  new Object();
	AtomicInteger number =  new AtomicInteger(1);
	
	public static void main(String[] args) {
		
		ThreadNumberPrinter tnp = new ThreadNumberPrinter();
		Thread t1 = new Thread(tnp.new Printer(0, 3));
		Thread t2 = new Thread(tnp.new Printer(1, 3));
		Thread t3 = new Thread(tnp.new Printer(2, 3));
		
		t1.start();
		t2.start();
		t3.start();
		
		 
	}

	public class Printer implements Runnable
	{
		
		int threadId;
		int numberOfThreads;
		
		public Printer(int id, int numberOfThreads)
		{
			this.threadId = id;
			this.numberOfThreads = numberOfThreads;
		}
		
		@Override
		public void run() 
		{
			try {
				while(true)
				{
					Thread.sleep(1000);
					synchronized (monitor) 
					{
						if(number.get() % numberOfThreads != threadId)
						{
							monitor.wait();
						}
						else
						{
							System.out.println("ThreadId[" +threadId 
									+ "] printing -->" 
									+ number.getAndIncrement());
							monitor.notifyAll();
						}
					}
				}
				
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
