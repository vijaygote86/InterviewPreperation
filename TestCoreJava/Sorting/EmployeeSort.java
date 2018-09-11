package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EmployeeSort {
	
	public static void main(String[] args) {
		
		
		List<Employee> l1 = new ArrayList<>();
		Employee e1 = new Employee();
		e1.setId(101);e1.setAge(30);e1.setName("Vijay");e1.setSalary(2341);
		Employee e2 = new Employee();
		e2.setId(101);e2.setAge(10);e2.setName("Vijay");e2.setSalary(2111);
		Employee e3 = new Employee();
		e3.setId(101);e3.setAge(17);e3.setName("Vijay");e3.setSalary(1234);
		Employee e4 = new Employee();
		e4.setId(101);e4.setAge(21);e4.setName("Vijay");e4.setSalary(564);
		Employee e5 = new Employee();
		e5.setId(101);e5.setAge(15);e5.setName("Vijay");e5.setSalary(101);
		
		l1.add(e1);l1.add(e2);l1.add(e3);l1.add(e4);l1.add(e5);
		
		Collections.sort(l1, new EmployeeAgeComparator());
		Iterator<Employee> it = l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getAge());
		}
		
		
		
	}

}
