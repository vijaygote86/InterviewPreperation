package src.test.java.concurrency;

import java.util.concurrent.RecursiveTask;

public class FibonacciCal extends RecursiveTask<Integer>
{

	final int num;
	public FibonacciCal(int num)
	{
		this.num = num;
	}
	
	@Override
	protected Integer compute() {
		
		if(num <= 1)
			return num;
		FibonacciCal fcal1 = new FibonacciCal(num-1);
		fcal1.fork();
		FibonacciCal fcal2 = new FibonacciCal(num -2);
		return fcal2.compute() + fcal1.join();
	}
}
