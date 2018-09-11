package src.test.java.concurrency;

public class ThreadJoinExample extends Thread
{
	public void run()
	{
		for(int i=0; i<2; i++)
		{
			try 
			{
				Thread.sleep(2000);
				System.out.println("Current thread is : " + Thread.currentThread().getName());
			} catch (Exception e) 
			{
				System.out.println("Exception is caught " +e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		ThreadJoinExample t1 = new ThreadJoinExample();
		ThreadJoinExample t2 = new ThreadJoinExample();
		ThreadJoinExample t3 = new ThreadJoinExample();
		
		t1.start();
		
		try 
		{
			System.out.println("Current thread is : " +Thread.currentThread().getName());
			t1.join();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception has caught :" +e);
		}
		
		t2.start();
		
		try 
		{
			System.out.println("Current thread is : " +Thread.currentThread().getName());
			t2.join();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is caught : " +e);
		}
		
		t3.start();
		try 
		{
			System.out.println("Current thread is : " +Thread.currentThread().getName());
			t3.join();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is caught : " +e);
		}
	}
}
