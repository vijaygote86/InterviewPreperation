package cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Computation1 implements Runnable
{
	
	public static int product = 0;
	
	@Override
	public void run() {
		
		product = 2 * 3;
		try {
			Tester.newBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Computation2 implements Runnable
{

	public static int sum = 0;
	
	@Override
	public void run() {
		
		System.out.println("Is the barrier broken : "+Tester.newBarrier.isBroken());
		sum = 10 + 20;
		
		try {
			Tester.newBarrier.await(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Tester implements Runnable{
	
	public static CyclicBarrier newBarrier = new CyclicBarrier(3);

	@Override
	public void run() {
		
		System.out.println("Numebr of parties required to trip the barrier : " +newBarrier.getParties());
		System.out.println("Sum of product and sum : " +(Computation1.product + Computation2.sum));
		
		Computation1 comp1 = new Computation1();
		Computation2 comp2 = new Computation2();
		
		Thread t1 = new Thread(comp1);
		Thread t2 = new Thread(comp2);
		
		t1.start();
		t2.start();
		
		try {
			Tester.newBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Sum of product and sum : " +(Computation1.product + Computation2.sum));
		
		newBarrier.reset();
		System.out.println("Barrier reset successful");
	}
	
	public static void main(String[] args) {
		
		Tester tester = new Tester();
		Thread t1 = new Thread(tester);
		t1.start();
	}
	

}
