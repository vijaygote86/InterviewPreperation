package virtusa;

public class Test1 {
	
	public int[] arrangeNumbers(int arr[])
	{
		int[] finalArray = new int[(arr.length)];
		int leftIndex = 0;
		int rightIndex = (arr.length);
		System.out.println(rightIndex);
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >0)
			{
				finalArray[leftIndex] = arr[i];
				leftIndex++;
			}
			else
			{
				rightIndex--;
				finalArray[rightIndex] = arr[i];
				
			}
		}
		return finalArray;
	}
	
	public static void main(String[] args) {
			
		int[] arr = {1,-4,7,3,-9,2,-1,6};
		Test1 t1 =new Test1();
		int[] arr1 = t1.arrangeNumbers(arr);
		for(int i=0;i<arr1.length; i++)
		{
			if(i== arr.length-1)
				System.out.print(arr1[i]);
			else
				System.out.print(arr1[i] + " * ");
		}
		
		
		
	}

}
