package src.test.java.hackerrank;

public class CamelCase {
	
	public static void main(String[] args) {
		
		String s = "saveChangesInTheEditor";
		String [] splited = s.split("[A-Z]");
		System.out.println(splited.length);
		for(int i=1; i<=splited.length; i++)
		{
			System.out.println(splited[i-1]);
		}
	}

}
