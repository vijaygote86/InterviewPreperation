package src.test.java;

import java.util.Arrays;

public class ShallowClone {
	
	private int data[];
	
	public ShallowClone(int arr[])
	{
		this.data = arr;
	}
	
	public void showData()
	{
		System.out.println("Data Values " + Arrays.toString(data));
	}

	
	public static void main(String[] args) {
		
		int arr[] = {3,7,9};
		ShallowClone sClone = new ShallowClone(arr);
		sClone.showData();
		arr[0] = 13;
		sClone.showData();
	}
	
}
