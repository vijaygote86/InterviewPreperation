package src.test.java;

import java.util.Map;


public class TestString {

	public static void main(String[] args) {
		
		String x = new String("Hello");
		String y = new String("Hello");
		System.out.println(x.intern());
		System.out.println(y.intern());
		System.out.println(x==y);
		System.out.println(x.intern()==y.intern()); 
	}



}
