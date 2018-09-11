package src.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Employee {

	
	private int id;
	private String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	private int salary;
	
	public Employee()
	{
		this.salary=20000;
	}
	
	public void setSalary()
	{
		this.salary=40000;
	}
	
	public int getSalary()
	{
		return this.salary;
	}
	
	public static void main(String[] args) {
		
		
		HashMap<Employee, Object> testMap = new HashMap<Employee, Object>();
		Employee e = new Employee();
		
//		testMap.put(e, new Object());
//		//e.setSalary();
//		Set<Employee> employeeSet = testMap.keySet();
//		Iterator<Employee> it = employeeSet.iterator();
//		while(it.hasNext())
//		{
//			Employee e1 = it.next();
//			System.out.println(e.getSalary());
//		}
//		System.out.println(testMap.get(e));
		
		java.util.List<Employee> l1 = new ArrayList<Employee>();
		e.setAge(10);
		e.setName("Vijay");
		Employee e1 = new Employee();
		e1.setAge(10);
		e1.setName("Supriya");
		l1.add(e);
		l1.add(e1);
		Collections.sort(l1, new EmployeeAgeComparator());
		Collections.sort(l1, new EmployeeNameComparator());
		ListIterator<Employee> ltr = (ListIterator<Employee>) l1.listIterator();
		while (ltr.hasNext()) {
			Employee e2 = (Employee)ltr.next();
			System.out.println(e2.getAge() +":"+e2.getName());
			
		}
		
		
	}
	
}
