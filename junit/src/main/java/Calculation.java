

import java.util.StringTokenizer;

public class Calculation {
	
	public static int findMax(int arr[])
	{
		int max = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Max is :" +max);
		return max;
	}
	
	public static int findCube(int n)
	{
		System.out.println("cube is :" +n*n*n);
		return n*n*n;
	}
	
	
	public static String findReverseString(String str)
	{
		StringBuilder result = new StringBuilder();
		StringTokenizer token = new StringTokenizer(str, " ");
		while(token.hasMoreTokens())
		{
			StringBuilder sb = new StringBuilder();
			sb.append(token.nextToken());
			sb.reverse();
			result.append(sb);
		}
		System.out.println("reverse string is :" +result.toString());
		return result.toString();
	}

}
