import java.util.Arrays;


public class ContSubArrayOfGivenSum {

	
	//Write a java program to find continuous sub array whose sum is equal to a given number?
	
	static void findSubArray(int[] array, int givenSum)
	{
		int sum = array[0];
		
		int start = 0;
		
		for (int i = 1; i < array.length; i++) 
		{
			sum = sum-array[start];
			start++;

			if(sum==givenSum)
			{
				System.out.println("Input Array : "+Arrays.toString(array));

				System.out.println("Input Number : "+givenSum);

				System.out.print("Continuous Sub Array : ");

				for (int j = start; j <= i; j++)
				{
					System.out.print(array[j]+" ");
				}

				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		 findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
		  
	     findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
	  
	     findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
	}
}
