import java.util.Arrays;
import java.util.List;


public class UnboundedWildCards {

	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(4,5,6,7);
		disply(integerList);
		
		List<Double> doubleList = Arrays.asList(4.1, 5.1,6.1,7.1);
		disply(doubleList);
		
		List<Number> numberList = Arrays.asList(4,5,6,7);
		disply(numberList);
	}
	
	private static void disply(List<?> list)
	{
		System.out.println(list);
	}
}
