package com.tomtom;

import sun.font.CreatedFontTracker;

public class RecursionTest {
	
	
	public String manipulatedString(String s)
	{
		String finalString = null;;
		int length = s.length();
		int i=0;
		if(length==1)
		{
			finalString = Character.toString(s.charAt(i));
			return finalString;
		}
		else
		{
			finalString =  Character.toString(s.charAt(i));
			finalString = finalString + "*" + manipulatedString(s.substring(i+1));
			i++;
			length--;
		}
		
		return finalString;
	}
	
	public static void main(String[] args) {
		
		RecursionTest rtest = new RecursionTest();
		System.out.println(rtest.manipulatedString("Vijay"));
	}

}
