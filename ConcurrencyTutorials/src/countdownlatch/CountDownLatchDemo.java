package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(4);
		Worker firstWorker = new Worker(1000, latch, "Worker 1");
		Worker sencondWorker =  new Worker(1000, latch, "Worker 2");
		Worker thirdWorker = new Worker(1000, latch, "Worker 3");
		Worker fourthWorker = new Worker(1000, latch, "Worker 4");
		
		firstWorker.start();
		sencondWorker.start();
		thirdWorker.start();
		fourthWorker.start();
		
		latch.await();
		
		System.out.println(Thread.currentThread().getName() + " Finished");
	}
}

class Worker extends Thread
{
	private int delay;
	private CountDownLatch latch;
	private String name;
	
	public Worker(int deplay, CountDownLatch latch, String name)
	{
		super(name);
		this.delay = delay;
		this.latch = latch;
	}
	
	public void run()
	{
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " has finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
