import java.util.Arrays;
import java.util.List;


public class UpperBoundedWildCards {
	
	public static void main(String[] args) {
		
		List<Integer> inetegerList = Arrays.asList(4,5,6);
		System.out.println("Integer Sum is :" +sum(inetegerList));
		
		List<Double> doubleList = Arrays.asList(4.1,5.1,6.1);
		System.out.println("Double Sum is : "+sum(doubleList));
		
	}
	
	private static double sum(List<? extends Number> list)
	{
		double sum =0.0;
		for(Number i : list)
		{
			sum += i.doubleValue();
		}
		return sum;
	}

}
