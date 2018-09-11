import java.util.concurrent.atomic.AtomicBoolean;


public class ControlSubThread implements Runnable{
	
	private Thread worker;
	private final AtomicBoolean runnig  =  new AtomicBoolean(false);
	private int interval;

	public ControlSubThread(int interval) {
		this.interval = interval;
	}
	
	public void start()
	{
		worker = new Thread(this);
		worker.start();
	}
	
	public void stop()
	{
		runnig.set(false);
	}
	
	@Override
	public void run() {
		
		runnig.set(true);
		while(runnig.get())
		{
			try {
				Thread.sleep(interval);
				//Thread.currentThread().interrupt();
				System.out.println("This thread is interrupted....");
			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//				System.out.println("This thread is interrupted....");
			}
		}
		//System.out.println("This thread is interrupted....");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ControlSubThread t1 = new ControlSubThread(5000);
		t1.start();
		Thread.sleep(10);
		t1.stop();
	}

}
