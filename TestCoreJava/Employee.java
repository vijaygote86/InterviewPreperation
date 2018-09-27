import java.util.HashMap;


public class Employee {

	
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		
		this.id= id;
		this.name = name;
	}
		
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		Employee emp = (Employee) obj;
		
		return(emp.id == this.id && emp.name == this.name);
		
	}
	
	@Override
	public int hashCode()
	{
		return 1;
	}
	
	Employee e;
	
	public static void main(String[] args) {
		
//		Employee e1 = new Employee(1, "Vijay");
//		Employee e2 = new Employee(1, "Vijay");
//		
//		HashMap<Employee, Integer> hm = new HashMap<>();
//		hm.put(e1, 1);
//		hm.put(e2, 2);
//		
//		HashMap<Integer, Integer> hmtest = new HashMap<>();
//		
//		hmtest.put(1, 1);
//		System.out.println(hmtest.put(2, 1));
//		hmtest.put(1, 3);
//		
//		System.out.println(hmtest.size());
//		
//		System.out.println(e1==e2);
//		System.out.println(e1.equals(e2));
//		
//		System.out.println(hm.size());
//		
//		System.out.println('H'+'a');
//		
//		//System.out.println(e);
//		
//		 int[][] a = {{1,2,3,4},{2,3,4,5}};
//		 
//		 System.out.println(a[0].length);
//		 System.out.println(a.length);
//		 
//		 System.out.println(Integer.toString(1));
		
		
		 HashMap<String, Integer> hm = new HashMap<>();
			hm.put("ABC", 123);
			hm.put(new String("ABC"), 1);
			hm.put(new String("ABC"), 2);
			hm.put("ABC",34);
			
			String s = new String("ABC");
			String s1 =new String("ABC");
			
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
			
			Integer i1 = new Integer(2);
			Integer i2 = new Integer(2);
			
			System.out.println(i1.hashCode() +""+ i2.hashCode());
			
			
//			System.out.println(s.equals(s1));
//			
			System.out.println(hm.size());
			
			
	
	}
}
