package src.test.java;

public class Multithreading implements Runnable{

	int a=10;
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Multithreading());
		Thread t2 =new Thread(new Multithreading());
		Thread t3 = new Thread(new Multithreading());
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	@Override
	public void run() {
		a=10;
		a+=10;
		System.out.print(a + " ");
		
	}

}
