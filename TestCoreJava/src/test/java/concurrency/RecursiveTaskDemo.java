package src.test.java.concurrency;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskDemo {
	
	public static void main(String[] args) {
		
		FibonacciCal fcal = new FibonacciCal(5);
		ForkJoinPool fjPool = new ForkJoinPool();
		int i = fjPool.invoke(fcal);
		System.out.println(i);
	}

}
