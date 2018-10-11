package src.test.java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapValuesSorting {
	
	
	
	public static void main(String[] args) {
		
		
		EmployeeTest e1 = new EmployeeTest(1, "Vijay");
		EmployeeTest e2 = new EmployeeTest(1, "Vijay");
		
		HashMap<EmployeeTest, Integer> hm = new HashMap<>();
		hm.put(e1, 1);
		hm.put(e2, 2);
		
//		
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		
//		int i=10;
//		while(i -->0)
//		{
//			hm.put(i, i);
//		}
//		
////		List<Integer> coll = (List<Integer>) hm.values();
////		Collections.sort(coll);
		
		System.out.println(hm.size());
		
		HashMap<String, Integer> hmtest = new HashMap<>();
		hmtest.put(new String("ABC"), 1);
		hmtest.put(new String("ABC"), 2);
		System.out.println(hmtest);
	}

}

class EmployeeTest
{
	int id;
	String name;
	
	public EmployeeTest(int id, String name)
	{
		id=id;
		name=name;
	}
}
