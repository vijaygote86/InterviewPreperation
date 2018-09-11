import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public final class FinalClass {
	
	private final int id;
	private final String name;
	private final List<String> itemList;
	private final HashMap<Integer, String> itemMap;
	
	public FinalClass(int id, String name, List<String> list, HashMap<Integer, String> map)
	{
		this.id = id;
		this.name = name;
//		List<String> tempList = new ArrayList<String>();
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			tempList.add(itr.next());
//		}
		this.itemList=list;
		
//		HashMap<Integer, String> tempMap = new HashMap<Integer, String>();
//		int key;
//		Iterator<Integer> it = map.keySet().iterator();
//		while(it.hasNext())
//		{
//			key = it.next();
//			tempMap.put(key, map.get(key));
//		}
//		
//		System.out.println("tempMap : "+tempMap);
		this.itemMap = map;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<String> getItemList()
	{
		return (Collections.unmodifiableList(this.itemList));
	}
	
	public HashMap<Integer, String> getItemMap()
	{
		return (HashMap<Integer, String>)itemMap.clone();
	}

	public static void main(String[] args) 
	{
		int id=100;
		String name = "Vijay";
		List<String> l1 = new ArrayList<String>();
		l1.add("Vijay");
		l1.add("Shailesh");
		
		HashMap<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put(1, "Piyush");
		
		testMap.put(2, "Suyash");
		
		System.out.println("testMap : "+testMap);
		
		FinalClass finalClass = new FinalClass(id, name, l1, testMap);
		System.out.println("id : "+finalClass.getId());
		System.out.println("name : "+finalClass.getName());
		System.out.println("itemList : "+finalClass.getItemList());
		System.out.println("itemMap : "+finalClass.getItemMap());
		
		id=200;
		name = "Vijay1";
		/**
		 * this will throw java.lang.UnsupportedOperationException because of Collections.unmodifiableList(this.itemList)
		 */
//		List<String> l2 = finalClass.getItemList();
//		l2.add("Nikhil");
		
		HashMap<Integer, String> tmap = finalClass.getItemMap();
		tmap.put(3, "Shekhar");
		
		System.out.println("id after change : "+finalClass.getId());
		System.out.println("name after change : "+finalClass.getName());
		System.out.println("itemMap after change : "+finalClass.getItemMap());
		
	
	}
}
