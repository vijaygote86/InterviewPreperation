package src.test.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Vijay");
		l1.add("Shekhar");
		l1.add("Gote");
		l1.add("Pune");
		
		Iterator<String> iterator = l1.iterator();
		while(iterator.hasNext())
		{
			sb.append(iterator.next());
			if(iterator.hasNext())
			{
				sb.append(",");
			}
			
		}
		System.out.println("StringBuffer is :"+sb.toString());
		
		
		List<Integer> l2 =  new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(6);
		l2.add(12);
		l2.add(5);
		l2.add(15);
		l2.add(16);
		l2.add(18);
		l2.add(19); 
		l2.add(7);
		
		sb= new StringBuffer();
		Iterator<Integer> itr = l2.iterator();
		while(itr.hasNext())
		{
			int item = itr.next();
			if(item>10)
			{
				sb.append(item);
				if(itr.hasNext())
				{
					sb.append(",");
				}
			}
			
		}
		System.out.println("Numbers greater than 10 :"+sb.toString());
		
	}

}
