import java.util.Scanner;
import java.util.Stack;


public class BalancingBrackets {
	
	
	public boolean checkBalanced(String inputString)
	{
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<inputString.length(); i++)
		{
			char ch = inputString.charAt(i);
			if(ch =='(' || ch== '{' || ch == '[')
			{
				stack.push(ch);
			}
			else if(ch == ')' || ch == '}' || ch == ']')
			{
				if(stack.empty())
					return false;
				else
				{
					switch (ch) {
					case ')':
						if(')'!=stack.pop())
							return false;
						break;
					case '}':
						if('}'!= stack.pop())
							return false;
						break;
					case ']':
						if(']'!=stack.pop())
							return false;
						break;
					default:
						break;
					}
				}
			}
					
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		BalancingBrackets bb = new BalancingBrackets();
		System.out.println(bb.checkBalanced("()(){}{}{()}"));
	}

}
