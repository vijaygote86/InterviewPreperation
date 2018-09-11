import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;


public class HashMapTest {
	
	class Employee implements Comparable{
		int id;
		String name;
		public Employee(int id, String name)
		{
			this.id = id;
			this.name = name;
		}
		
		public int getId()
		{
			return this.id;
		}
		
		public String getName()
		{
			return this.name;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	

	
	public static void main(String[] args) {
		
		TreeMap<HashMapTest.Employee, Integer> h1 =new TreeMap<>();
		
		HashMap<Employee, Integer> hm = new HashMap<>();
		HashMapTest hmTest = new HashMapTest();
		HashMapTest.Employee e1 = hmTest.new Employee(1, "Vijay");
		HashMapTest.Employee e2 = hmTest.new Employee(1, "Vijay");
		
		h1.put(e1, 1);
		System.out.println(h1);
		hm.put(e1, 1);
		hm.put(e2, 2);
		Set<Employee> keySet = hm.keySet();
		Iterator<Employee> itr = keySet.iterator();
		while(itr.hasNext())
		{
			
			HashMapTest.Employee e3 = itr.next();
			System.out.println(e3.getId() +"::"+e3.getName()); 
		}
		//while(keySet.)
		//System.out.println(hm.keySet());
		
		
		
		
	}
}
