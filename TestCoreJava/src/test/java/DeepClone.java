package src.test.java;

import java.util.Arrays;

public class DeepClone {
	
	private int data[];
	
	public DeepClone(int arr[])
	{
		data = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			this.data[i] = arr[i];
		}
	}
	
	public void showData()
	{
		System.out.println("Data Values :" + Arrays.toString(data));
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1, 3, 7};
		DeepClone dClone = new DeepClone(arr);
		dClone.showData();
		arr[0] = 20;
		dClone.showData();
	}
}

