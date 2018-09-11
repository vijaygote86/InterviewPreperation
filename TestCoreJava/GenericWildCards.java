import java.util.ArrayList;
import java.util.List;


public class GenericWildCards {
	
	public static void main(String[] args) 
	{
		
		List<? extends Animal> a1 = new ArrayList<Animal>();
		List<? extends Animal> a2 = new ArrayList<Horse>();
		List<? super Horse> a3 = new ArrayList<Animal>();
		List<?> a4 = new ArrayList<Horse>();
		
	}

}

class Animal
{
	
}

class Horse extends Animal
{
}
