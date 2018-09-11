package ForkJoin;

import java.util.concurrent.RecursiveTask;

public class SimpleTask extends RecursiveTask<Integer>{

	private int simulatedWork;
	
	public SimpleTask(int simulatedWork)
	{
		
		this.simulatedWork = simulatedWork;
	}
	
	@Override
	protected Integer compute() {
		
		if(simulatedWork > 100)
		{
			System.out.println("Parallle execution is needed because of huge task : " +simulatedWork);
			
			SimpleTask task1 = new SimpleTask(simulatedWork/2);
			SimpleTask task2 = new SimpleTask(simulatedWork/2);
			
			task1.fork();
			task2.fork();
			
			int solution = 0;
			
			solution += task1.join();
			solution += task2.join();
			
			return solution;
		}
		else
		{
			System.out.println("No need of parallel execution : " + simulatedWork);
			return 2*simulatedWork;
		}

	}

}
