
public class idemiaStringTest {
	
	public static void main(String[] args) {
		
		
		String s= "vijay";
		int length = s.length();
		if(length>0)
		{
			String s1, s2;
			s1=s.substring(0, length/2);
			char middleChar = s.charAt((length/2));
			s1 += middleChar;
			System.out.println(s1);
			s2 = s.substring((length/2)+1, length);
			s2 +=middleChar;
			System.out.println(s2);
		}
	}

}
