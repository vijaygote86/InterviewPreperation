package src.test.java.eight.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {
	
	public static void main(String[] args) {
		
		List<Integer> list =  new ArrayList<Integer>();
		for(int i=0; i<10; i++)
		{
			list.add(i);
		}
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		list.forEach(new Consumer<Integer>(){
			
			public void accept(Integer t)
			{
				System.out.println("For each anonymous class :: " +t);
			}
		});
	}

}
