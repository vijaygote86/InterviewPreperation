package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	
	private List<String> empList;
	
	public Employees()
	{
		empList =  new ArrayList<String>();
	}
	
	public Employees(List<String> emplist)
	{
		this.empList = emplist;
	}
	
	public void loadData()
	{
		empList.add("Pankaj");
		empList.add("Vijay");
		empList.add("Shekhar");
		empList.add("Deepak");
	}
	
	public List<String> getEmpList()
	{
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		
		List<String> temp = new ArrayList<String>();
		for(String s : this.empList)
		{
			temp.add(s);
		}
		return new Employees(temp);
	}
}
