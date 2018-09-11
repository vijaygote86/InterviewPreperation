package amazon.test;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to find firt non repeated character :");
		String inputString = scanner.nextLine();
		FirstNonRepeated f = new FirstNonRepeated();
		Character c = f.findFirstNonRepeatedChar(inputString);
		System.out.println("First non repeated chracter is : " +c);
	}
	
	public Character findFirstNonRepeatedChar(String str)
	{
		HashMap<Character, Integer> characterCountMap = new HashMap<Character, Integer>();
		Character c;
		for(int i=0; i<str.length(); i++)
		{
			c = str.charAt(i);
			if(characterCountMap.containsKey(c))
			{
				characterCountMap.put(c, characterCountMap.get(c)+1);
			}
			else
			{
				characterCountMap.put(c, 1);
			}
		}
		
		for(int i =0; i<str.length(); i++)
		{
			c = str.charAt(i);
			if(characterCountMap.get(c) ==1)
				return c;
		}
		return null;
	}

}
