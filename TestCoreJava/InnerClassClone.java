
public class InnerClassClone {
	
	static class MyInnerClass implements Cloneable
	{
		int id= 0;
		String name;
		
		public Object clone() throws CloneNotSupportedException
		{
			return super.clone();
		}
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		InnerClassClone.MyInnerClass myInner = new InnerClassClone.MyInnerClass();
		InnerClassClone.MyInnerClass clone = (InnerClassClone.MyInnerClass) myInner.clone();
		
		System.out.println(myInner == clone);
	}

}
