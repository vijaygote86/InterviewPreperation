import java.util.Arrays;


public class TheArrayList {
	
	private Object[] myArrayList;
	private int actSize = 0;
	
	public TheArrayList()
	{
		final int size = 10;
		myArrayList = new Object[size];
	}
	
	private void increaseSize()
	{
		myArrayList = Arrays.copyOf(myArrayList, myArrayList.length*2);
		System.out.println("MyArrayLis size is now : " +myArrayList.length);
	}
	
	public void add(Object object)
	{
		if(myArrayList.length - actSize <=5)
			increaseSize();
		myArrayList[actSize++] = object;
	}
	
	public Object remove(int index)
	{
		if(index < actSize)
		{
			Object obj = myArrayList[index];
			myArrayList[index] = null;
			int tmp = index;
			while(tmp < actSize)
			{
				myArrayList[tmp] = myArrayList[tmp+1];
				myArrayList[tmp+1] = null;
				tmp++;
			}
			actSize--;
			return obj;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public Object get(int index)
	{
		if(index<actSize)
		{
			return myArrayList[index];
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public int size()
	{
		return actSize;
	}
	
	public static void main(String[] args) {
		
		TheArrayList theArrayList = new TheArrayList();
		theArrayList.add(new Integer(10));
		theArrayList.add(new Integer(11));
		theArrayList.add(new Integer(12));
		theArrayList.add(new Integer(13));
		theArrayList.add(new Integer(14));
		theArrayList.add(new Integer(15));
		theArrayList.add(new Integer(16));
		theArrayList.add(new Integer(17));
		theArrayList.add(new Integer(18));
		theArrayList.add(new Integer(19));
		theArrayList.add(new Integer(20));
		
		for(int i=0; i<theArrayList.size();i++)
		{
			System.out.println(theArrayList.get(i));
		}
		
		System.out.println("Obect : " + theArrayList.remove(3) + " is removed from arraylist");
	}
	
	

}
