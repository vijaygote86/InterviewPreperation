
public class Employee {
	
	int id;
	String name;
	String address;
	
		
	@Override
	public boolean equals(Object obj)
	{

		if(obj == null)
		{
			return false;
		}

		if(obj instanceof Employee && this==obj)
		{
			return true;
		}

		Employee newEmp = (Employee)obj;

		if(address != null && !address.equalsIgnoreCase(newEmp.address))
		{
			return false;
		}

		if(id != newEmp.id)
			return false;

		if(name!= null && !name.equalsIgnoreCase(newEmp.name))
		{
			return false;
		}

		return true;
	}
}
