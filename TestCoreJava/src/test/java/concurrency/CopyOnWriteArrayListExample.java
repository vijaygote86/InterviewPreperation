package src.test.java.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Difference between ArralyLisy And CopyOnWiterArrayList
 * 
 * 1. ArrayList is not thread safe whereas CopyOnWriteArrayList is thread safe.
 * 2. Iterator of ArrayList is fail-fast any modification in list will throws 
 *    ConcurrentModificationException whereas iterator of CopyOnWriteArraList is 
 *    fail-safe.
 * 3. add and set operations are implemented by making fresh copy of underlying array.
 *  
 */

public class CopyOnWriteArrayListExample {
	
	public static void main(String[] args) {
		
		
		CopyOnWriteArrayList<String> copyOnWriteArraList = new CopyOnWriteArrayList<String>();
		
		copyOnWriteArraList.add("Java");
		copyOnWriteArraList.add("Spring");
		copyOnWriteArraList.add("Collection");
		
		Iterator<String> iterator = copyOnWriteArraList.iterator();
		
		System.out.println("copyOnArrayList :: ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			copyOnWriteArraList.add("Vijay");
			//iterator.remove();
		}
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Java");
		arrayList.add("Spring");
		arrayList.add("Collection");
		
		Iterator<String> itr = arrayList.iterator();
		
		System.out.println("arrayList :: ");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			arrayList.add("Vijay");
			//iterator.remove();
		}
		 
	}

}
