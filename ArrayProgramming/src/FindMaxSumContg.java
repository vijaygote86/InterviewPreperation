
public class FindMaxSumContg {

	//Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
	
	public static void main(String[] args) {
		
		
		int[] array = {12,10,-22,23,56,23,12,15,-13,20,14};
		
		int sum = 0;
		int finalSum = 0;
		int lastIndex = 0;
		int firstIndex = 0;
	    boolean flag = true;
	    
		for(int i=0; i<array.length; i++)
		{
			sum = sum+array[i];
			
			if(sum > finalSum)
			{
				if(flag)
				{
					firstIndex = i;
					flag = false;
				}
				finalSum = sum;
				lastIndex = i;
			}
			else
			{
				sum = 0;
				flag = true;
			}
		}
		System.out.println("Contg Array with maximum sum : " + finalSum );
		for(int i=firstIndex; i<=lastIndex; i++)
		{
			System.out.print(" "+array[i]);
		}
	}
	
}
