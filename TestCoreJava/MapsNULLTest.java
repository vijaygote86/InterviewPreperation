import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;


public class MapsNULLTest {
	
	public static void main(String[] args) {
		
		/**
		 * Only Hashmap allow null key and null values
		 */
		HashMap<Integer, Integer> testHashMap = new HashMap<>();
		testHashMap.put(1, 1);
		testHashMap.put(null, null);
		
		Iterator<Integer> itr = testHashMap.keySet().iterator();
		
		List<Integer> list = new ArrayList<Integer>();
		ListIterator<Integer> it1= list.listIterator();
		
		
//		
//		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
//		linkedHashMap.put(null, null);
//		
//		Hashtable<Integer, Integer> testHashtable = new Hashtable<>();
//		testHashtable.put(1, 1);
//		testHashtable.put(2, null);
//		
//		TreeMap<Integer, Integer> testTreeMap = new TreeMap<>();
//		testTreeMap.put(1, 1);
//		testTreeMap.put(2, null);
//		testTreeMap.put(3, null);
//		System.out.println(testTreeMap);
//		
		ConcurrentHashMap<Integer, Integer> conHashMap = new ConcurrentHashMap<>();
		conHashMap.put(1, 1);
		conHashMap.put(2, null);
		
//		ConcurrentSkipListMap<Integer, Integer> conCurrSkipListMap = new ConcurrentSkipListMap<>();
//		conCurrSkipListMap.put(1, 1);
//		conCurrSkipListMap.put(null, null);
		
	}

}
