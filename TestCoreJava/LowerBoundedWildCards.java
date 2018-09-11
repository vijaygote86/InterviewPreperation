import java.util.Arrays;
import java.util.List;


public class LowerBoundedWildCards {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> integrList = Arrays.asList(4,5,6,7);
		displayList(integrList);
		
		List<Number> numberList = Arrays.asList(4,5,6,7);
		displayList(numberList);
	}
	
	private static void displayList(List<? super Integer> list)
	{
		System.out.println(list);
	}
}
