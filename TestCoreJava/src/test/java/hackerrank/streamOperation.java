package src.test.java.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class streamOperation {
	
	public static void main(String[] args) {
		ArrayList<String> newList = new ArrayList<>();
		
		List<String> l1 = new ArrayList<String>();
		l1.add("ABC");
		l1.add("PQR");
		l1.add("xyz");
		l1.stream().forEach(p -> {
			if(!newList.contains("ABC"))
				newList.add(p);
		});
		System.out.println(newList);
	}

}
