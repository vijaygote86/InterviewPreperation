
public class SecondLargestElementInArray {
	
//2) Write a java program to find second largest element in an array of integers?
	
	static void secondLargest(int[] array)
	{
		int firstLargest, secondLargest;
		
		if(array[0] > array[1])
		{
			firstLargest = array[0];
			secondLargest = array[1];
		}
		else 
		{
			firstLargest = array[1];
			secondLargest = array[0];
		}
		
		for(int i=2; i<array.length; i++)
		{
			if(array[i] > firstLargest)
			{
				secondLargest = firstLargest;
				firstLargest = array[i];
			}
			else if(array[i]<firstLargest && array[i] > secondLargest)
			{
				secondLargest = array[i];	
			}
		}
		System.out.println("Second Largest : " +secondLargest);
	}
	
	public static void main(String[] args) {
		
		SecondLargestElementInArray.secondLargest(new int[]{1234,67432,1230,5543,8765,2323,1212});
	}

}
