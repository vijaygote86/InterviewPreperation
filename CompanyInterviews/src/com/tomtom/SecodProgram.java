package com.tomtom;

import java.util.HashSet;

public class SecodProgram {
	
	
	public static void main(String[] args) {
		
		int[] array = new int[] {2,2,3,3,4,5,8,8};
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i =0; i<array.length; i++)
		{
			hs.add(array[i]);
		}
		
		if(hs.size()>array.length/2)
			System.out.println(array.length/2);
		else
			System.out.println(hs.size());
	}

}
