package src.test.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class FinalTest {
	
	
	
	
	public void disply(int i, long l)
	{
		System.out.println("Int and Long");
	}
	
	public void disply(long l, int i)
	{
		System.out.println("Long and int");
	}
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(4);
		l1.add(3);
		l1.add(2);
		
		List l2 = java.util.Collections.unmodifiableList(l1);
		//java.util.Collections.sort(l1);
		System.out.println(l1);
//		l2.add(5);
		l1.add(5);
		System.out.println(l2);
		System.out.println(l2.size());
//		final int i;
//		
//		final List<String> l1 = new ArrayList<>();
//		l1.add("vijay");
//		l1.add("Deepak");
//		
//		System.out.println(l1);
//		
////		i=20;
////		i=30;
////		l1 = new ArrayList<>();
//		
//		boolean b;
//		b=( 1==1);
//		
////		double b1 =20.25;
////		System.out.println(b1%10);
//		int h;
//		Object key = new Object();
//		System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
		
		FinalTest ftest = new FinalTest();
		ftest.disply(1l, 1);
	}
	
	public void test()
	{}

}
