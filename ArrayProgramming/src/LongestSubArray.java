
public class LongestSubArray {

	
	public static void main(String[] args) {
		
		
		int[] array = {1,2,3,4,5,2,4,6,8,9,10,11,12,50,1,2,6,3,4,5,6,7};
		int counter=1, maxCounter = 1;
		int lastIndex=1;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]<array[i+1])
			{
				counter++;
			}
			else
			{
				if(counter>maxCounter)
				{
					maxCounter = counter;
					counter =1;
					lastIndex = i;
				}
			}
		}
		for (int i = lastIndex-(maxCounter-1); i <= lastIndex; i++) {
			System.out.print(array[i]+" , ");
		}
	}
}
