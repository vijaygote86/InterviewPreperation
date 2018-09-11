package ThinkAnalyst;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveOdd {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		str = str.substring(0, 2);
		System.out.println(str);
		System.out.println(str.substring(0, 2));
		
		
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		ListIterator<Integer> ltr = l1.listIterator();
		
		while (ltr.hasNext()) {
			int temp = ltr.next();
			if(temp % 2 >=1)
			{
				//l2.add(temp);
				ltr.remove();
				//l1.remove(temp);
				ltr.add(10);
			}
		}
		
		//l1.removeAll(l2);
		System.out.println(l1);
	}

}
