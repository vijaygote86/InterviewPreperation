import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;


public class SetNullTest {

	public static void main(String[] args) {
		
		HashSet<Integer> testHashSet = new HashSet<>();
		testHashSet.add(null);
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(null);
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(null);
		
		ConcurrentSkipListSet<Integer> conSkipListSet = new ConcurrentSkipListSet<>();
		conSkipListSet.add(null);
		
	}
	
}
