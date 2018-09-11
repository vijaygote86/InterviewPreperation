package src.test.java;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Question13 {
	
	public int fun(int n)
	{
		System.out.println("Hello");
		return(n<3 ? 1 :fun(n-1)+fun(n-2));
	}
	
	
	public static void main(String[] args) {
		
		Question13 q = new Question13();
		//q.fun(8);
		final java.util.List<String> l1 = new ArrayList<String>();
		l1.add("Vijay");
		System.out.println(l1.size());
		
	}

}


