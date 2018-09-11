package src.test.java.designpatterns.structural.composite;

public class EmployeeCompositeTest {
	
	public static void main(String[] args) {
		
		Employee ceo = new Employee("John", "CEO", 30000);
		Employee headSales = new Employee("Robert", "headsales", 20000);
		Employee headMarketing = new Employee("Rob", "headMarketing", 20000);
		Employee salesExecutive1 = new Employee("Michel", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Laura", "Sales", 10000);
		Employee clerk1 = new Employee("Bob", "Marketing", 8000);
		Employee clerk2 = new Employee("Richard", "Marketing", 8000);
		
		ceo.add(headSales);
		ceo.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		System.out.println(ceo);
		
		for(Employee headEmloyee : ceo.getSubordinates())
		{
			System.out.println(headEmloyee);
			for(Employee employee : headEmloyee.getSubordinates())
			{
				System.out.println(employee);
			}
		}
	}
}
