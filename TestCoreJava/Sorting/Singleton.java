package Sorting;

public class Singleton {
	
public static void main(String[] args) {
	SingleEnum.instance_.display();
}
}

enum SingleEnum
{
	instance_;
	
	public void display(){
		System.out.println("Enum singleton");
	}
	
}


