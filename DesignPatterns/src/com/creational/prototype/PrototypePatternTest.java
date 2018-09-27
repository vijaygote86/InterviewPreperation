package com.creational.prototype;

import java.util.List;

public class PrototypePatternTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Employees emp = new Employees();
		emp.loadData();
		
		Employees emp1 = (Employees)emp.clone();
		Employees emp2 = (Employees) emp.clone();
		
		List<String> l1 = emp1.getEmpList();
		List<String> l2 = emp2.getEmpList();
		
		l1.add("John");
		
		l2.remove("Pankaj");
		
		System.out.println(emp.getEmpList());
		System.out.println(l1);
		System.out.println(l2);
	}

}
