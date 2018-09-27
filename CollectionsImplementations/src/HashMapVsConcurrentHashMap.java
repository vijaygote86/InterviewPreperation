import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;


public class HashMapVsConcurrentHashMap {

	/*
	 * 
	 * HashMap Vs ConcurrentHashMap in Java

First and foremost difference between HashMap and ConcurrentHashMap in Java is of course thread safety. ConcurrentHashMap is thread safe and fit for use in a multi-threaded environment whereas HashMap is not thread safe.
Second difference is about how these data structures synchronize. HashMap can be synchronized using the Collections.synchronizedMap() method but that synchronizes all the methods of the HashMap on a common lock and effectively reduces it to a data structure where one thread can enter at a time.

In ConcurrentHashMap synchronization is done a little differently. Rather than locking every method on a common lock, ConcurrentHashMap uses separate lock for separate buckets thus locking only a portion of the Map.

By default there are 16 buckets and also separate locks for separate buckets. So the default concurrency level is 16. That means theoretically any given time 16 threads can access ConcurrentHashMap if they all are going to separate buckets.

In ConcurrentHashMap performance is further improved by providing read access concurrently without any blocking. Retrieval operations (including get) generally do not block, so may overlap with update operations (including put and remove).
HashMap allows one null as key but ConcurrentHashMap doesn't allow null as key.

Performace wise HashMap is better as there is no synchronization.

In case HashMap has to be used in a multi-threaded environment and there is a need to use Collections.SynchronizedMap() method then ConcurrentHashMap() is a better choice as ConcurrentHashMap still gives a chance to more than one thread to access map thus improving performance.

Iterator provided by ConcurrentHashMap is fail-safe which means it will not throw ConcurrentModificationException if the underlying structure is changed during iteration.

Iterator provided by HashMap is fail-fast as it throws a ConcurrentModificationException if the underlying collection is structurally modified at any time after the iterator is created.
	 */
	
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("vijay", 1);
		
		ConcurrentHashMap<String, Integer> concHashMap = new ConcurrentHashMap<>();
		concHashMap.put("Vijay", null);
	}
	
}
