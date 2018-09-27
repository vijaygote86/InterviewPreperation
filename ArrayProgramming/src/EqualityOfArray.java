import java.util.Arrays;


public class EqualityOfArray {
	
	//Write a java program to check the equality of two arrays?
	
	public static void main(String[] args) {
		
		int[] array1 = {11,12,13,14,15,16};
		int[] array2 = {11,12,13,14,15,16};
		
		boolean arraysEqual = true;
		
		//Using Arrays.equal
		//arraysEqual = Arrays.equals(array1, array2);
		
		if(array1.length == array2.length)
		{
			for(int i =0; i<array1.length; i++)
			{
				if(array1[i] != array2[i])
					arraysEqual = false;
			}
		}
		else
			arraysEqual = false;
		
		System.out.println("Input array 1 : " +Arrays.toString(array1));
		System.out.println("Inpout array 2: " +Arrays.toString(array2));
		
		if(arraysEqual)
			System.out.println("Both the arrays are equal");
		else
			System.out.println("Both arrays are not equal");
	}

}
