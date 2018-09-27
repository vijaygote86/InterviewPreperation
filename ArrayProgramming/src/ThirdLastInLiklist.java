import java.util.Iterator;
import java.util.LinkedList;


public class ThirdLastInLiklist {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		for(int i=1; i<=10; i++)
		{
			l1.add(i);
		}
		Iterator<Integer> ltr= l1.iterator();
		Integer j = 0;
		
		for(int i=1; i<=l1.size()-2; i++)
		{
			j = ltr.next();
		}
		System.out.println(j);
		
	}

}
