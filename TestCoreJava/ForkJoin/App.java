package ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class App {
	
	public static void main(String[] args) {
		
		ForkJoinPool fkpool = new ForkJoinPool(8);
		SimpleRecursiveAction action = new SimpleRecursiveAction(200);
		fkpool.invoke(action);
	}
	
	

}
