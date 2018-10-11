package com.sync.demo;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending message : " +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg + " sent");
	}
}

class ThreadedSend extends Thread
{
	
	private String msg;
	private Thread t;
	Sender sender;
	
	public ThreadedSend(String msg, Sender obj) {
		this.msg = msg;
		this.sender = obj;
	}
	
	public void run()
	{
		synchronized (sender) {
			sender.send(msg);
		}
	}
}

public class SyncDemo {
	
	public static void main(String[] args) {
		
		
		Sender send = new Sender();
		ThreadedSend t1 = new ThreadedSend("Hi", send);
		ThreadedSend t2 = new ThreadedSend("Bye", send);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
