import java.util.HashSet;

// 1) Write a java program to find duplicate elements in an array?

public class DuplictateInArray {
	
	public static void main(String[] args) {
		
		// Brute Force method
		
		String[] strArray  = {"JAVA", "SQL", "COBOL", "PASCAL","SCALA", "JAVA", "PYTHON", "ML", "SQL"};
		for(int i=0; i< strArray.length-1; i++)
		{
			for(int j=1; j<strArray.length; j++)
			{
				if(strArray[i].equals(strArray[j]) && i!=j)
					System.out.println("Duplcate element in array is : " +strArray[i]);
			}
		}
		
		//Using Hashset
		
		HashSet<String> finalHashet = new HashSet<>();
		for(String string : strArray)
		{
			if(!finalHashet.add(string))
			{
				System.out.println("Duplicate String is : " +string);
			}
				
		}
	}

}
