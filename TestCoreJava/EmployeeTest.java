import java.util.HashMap;

public class EmployeeTest {
	
	int id;
	String name;
	
	public EmployeeTest(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return 1;
	}
	
	@Override
	public boolean equals(Object o)
	{
		return false;
	}
	
	public static void main(String[] args) {
		
		
		HashMap<EmployeeTest, Integer> m = new HashMap<>();
		EmployeeTest e1 = new EmployeeTest(1, "Vijay");
		EmployeeTest e2 = new EmployeeTest(2, "Shekhar");
		EmployeeTest e3 = new EmployeeTest(3, "Deepak");
		m.put(e1, 5);
		m.put(e1, 1);
		m.put(e2, 2);
		m.put(e3, 3);
		
		System.out.println(m.get(e1));
	}

}
