import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class IteratorVsListIterator {

	/**
	 * 	                    | ListIterator	             |  Iterator
Traversal Direction	        | Both ,forward and backward |  Forward
Objects traversal	        | List only 	             |  Map, Set and List 
Add and Set operations	    | Allows both operations	 |  Not possible
Iterator's current position	| Yes , can be determined	 |  Not possible.
Retrieve Index	            | Yes	                     |  Not possible
	 */


	public static void main(String[] args) {

		List listObject = new ArrayList();
		listObject.add("Alive is awesome");
		listObject.add("Love yourself");

		ListIterator listIteratorObject =  listObject.listIterator();
		System.out.println("ListIterator object output in forward direction:");
		System.out.println("");


		while( listIteratorObject.hasNext() )
		{
			System.out.println(listIteratorObject.next());
			System.out.println(listIteratorObject.nextIndex());
		}

		System.out.println("ListIterator object output in backward direction:");
		System.out.println("");


		while( listIteratorObject.hasPrevious() )
		{
			System.out.println(listIteratorObject.previous());
			System.out.println(listIteratorObject.previousIndex());
		}


		List iteratorListObject = new ArrayList<>();

		iteratorListObject.add("Facebook");  
		iteratorListObject.add("Google");
		iteratorListObject.add("Apple");

		Iterator javaHungryIterator =  iteratorListObject.iterator();
		System.out.println("Iterator object output in forward direction:");

		while( javaHungryIterator.hasNext() )
		{
			System.out.println(javaHungryIterator.next());
		}

	}
}

