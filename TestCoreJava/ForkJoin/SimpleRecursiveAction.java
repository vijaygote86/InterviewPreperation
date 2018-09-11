package ForkJoin;

import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction{
	
	private int simulatedWork;
	
	public  SimpleRecursiveAction(int simultaedWork) 
	{
		this.simulatedWork = simultaedWork;
	}

	@Override
	protected void compute() {


		if(simulatedWork > 100)
		{
			
			System.out.println("Simulated work is : " +simulatedWork );
			SimpleRecursiveAction simpleRecursiveAction1 = new SimpleRecursiveAction(simulatedWork/2);
			SimpleRecursiveAction simpleRecursiveAction2 = new SimpleRecursiveAction(simulatedWork/2);
			
			simpleRecursiveAction1.fork();
			simpleRecursiveAction2.fork();
		}
		else
		{
			System.out.println("No need for Parallel execution : " + simulatedWork);
		}
		
	}

}
