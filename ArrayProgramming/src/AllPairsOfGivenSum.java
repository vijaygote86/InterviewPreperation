import java.util.Arrays;


public class AllPairsOfGivenSum {
	
	//Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?
	
	
	static void findPairs(int[] array, int givenSum)
	{
		System.out.println("Input Array is :" +Arrays.toString(array));
		System.out.println("Given sum is :" +givenSum);
		System.out.println("Below is the list of pairs of :" +givenSum);
		for(int i=0; i<array.length; i++)
		{
			for (int j = 1; j < array.length-1; j++) {
				
				if(array[i] + array[j] == givenSum)
				{
					System.out.println(array[i] +" + " +array[j] + " = " +givenSum);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		AllPairsOfGivenSum.findPairs(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
		
		AllPairsOfGivenSum.findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
		  
		AllPairsOfGivenSum.findPairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
	  
		AllPairsOfGivenSum.findPairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
		
	}

}
