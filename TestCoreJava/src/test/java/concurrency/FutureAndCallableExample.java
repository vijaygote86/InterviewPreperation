package src.test.java.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableExample {
	
	public static void main(String[] args) {

		ExecutorService excutorService =  Executors.newSingleThreadExecutor();

		Callable<String> callable = () ->
		{
			System.out.println("Entered in callable");
			Thread.sleep(5000);
			return "Callable says Hello!";
		};

		Future<String> future = excutorService.submit(callable);
		
		System.out.println("Do Something while callable gets executed....");

		try {
			String result = future.get();
			System.out.println(result);
			
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		} 
		catch (ExecutionException e) 
		{
			e.printStackTrace();
		} finally{
			excutorService.shutdown();
		}
	}
}
