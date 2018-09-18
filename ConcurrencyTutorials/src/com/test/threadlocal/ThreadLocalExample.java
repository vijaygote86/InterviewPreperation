package com.test.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalExample implements Runnable{

	private static final ThreadLocal<SimpleDateFormat> threadLocalSdf = new ThreadLocal<SimpleDateFormat>()
			{
	
	//@Override
	protected SimpleDateFormat initialValue()
	{
		return new SimpleDateFormat("yyyyMMdd HHmm");
	}
			};
	
	
	@Override
	public void run() {
		
		threadLocalSdf.set(new SimpleDateFormat());
		
		System.out.println("Thread name := " +Thread.currentThread().getName() + "default formatter = " +threadLocalSdf.get().toPattern());
		
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadLocalSdf.set(new SimpleDateFormat());
		
		System.out.println("Thread name := " +Thread.currentThread().getName() + "default formatter = " +threadLocalSdf.get().toPattern());
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadLocalExample threadLocal = new ThreadLocalExample();
		
		for(int i=0; i<10; i++)
		{
			Thread t = new Thread(threadLocal, ""+i);
			Thread.sleep(new Random().nextInt(1000));
			t.start();
		}
		
	}

}
