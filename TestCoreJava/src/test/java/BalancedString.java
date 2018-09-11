package src.test.java;

import java.util.HashMap;
import java.util.Stack;

public class BalancedString {
	
public HashMap<Character, Integer> characterMap = new HashMap<>();

	public static void main(String[] args) {
		String testString = "abbcc";
		
		if (args.length > 0) {
			testString = args[0];
		}

		char[] chars = testString.toCharArray();
		BalancedString bs = new BalancedString();

		System.out.println(bs.checkIfBalanced(chars));
		
	}

	private String checkIfBalanced(char[] chars) {
		int counter =1;
		boolean flag = true;
		for (int i = 0; i < chars.length; i++) {

			if(characterMap.containsKey(chars[i])){
				counter = characterMap.get(chars[i]);
				counter ++;
				characterMap.put(chars[i], counter);
				counter = 1;
			}else{
				characterMap.put(chars[i], counter);
			}
			
		}
		
		for (Integer value : characterMap.values()) {
			if(value % 2 !=0){
			 flag = false;
			 break;
			}
		}
		
		if(flag){
			return "Yes";	
		}else{
			return "No";
		}
			
		
		
	}
}