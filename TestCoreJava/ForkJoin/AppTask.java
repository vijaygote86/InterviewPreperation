
package ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class AppTask {
	
	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleTask task = new SimpleTask(120);
		System.out.println(pool.invoke(task));
	}

}
