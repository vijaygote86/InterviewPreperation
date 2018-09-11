package src.test.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		
		testMap.put(1, "Vijay");
		testMap.put(2, "Shekhar");
		testMap.put(3, "Rahul");
		testMap.put(4, "Priya");
		
		//--Type 1 iterating map using for each 
		for(Map.Entry<Integer, String> entry : testMap.entrySet())
		{
			System.out.println("Key :=" +entry.getKey() +
								" Value :=" +entry.getValue());
		}
		
		//-- Type 2 iterating using keySet and values
		
		for(Integer key : testMap.keySet())
		{
			System.out.println("Key : = " +key);
		}
		for(String value : testMap.values())
		{
			System.out.println("Values := "+value);
		}
		
		//-- Type 3 iterating using iterator over Map.Entry<K, V>
		
		Iterator<Map.Entry<Integer, String>> iterator =  testMap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key :=" +entry.getKey() +
								" Value := " +entry.getValue());
		}
		
		//-- Type 4 iterating using forEach
		//-- Java 8 using lambda expression
		testMap.forEach((k, v) -> System.out.println("Key = " +k +
				", Value = " + v));
		
		//-- Type 5 iterating over keys and searching for values
		for(Integer key : testMap.keySet())
		{
			System.out.println("Key := " +key 
								+ " Value : =" + testMap.get(key));
		}
	}
}
