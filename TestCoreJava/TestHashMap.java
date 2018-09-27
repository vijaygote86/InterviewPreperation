import java.util.HashMap;


public class TestHashMap {

	

	public static void main(String[] args) {
		
		
		HashMap<Integer, Integer> hm =new HashMap<>();
		
		hm.put(1, 1);
		hm.put(2,2);
		hm.put(1, 3);
		
		System.out.println(hm.size());
		System.out.println(hm);
	}
}
