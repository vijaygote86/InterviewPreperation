
public class TestDemo1 {

	public static void main(String[] args) {
		
		Object o = new Object();
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = null;
		
		o=o1;
		o1=o2;
		o2=o3;
		
		System.out.println("o :" +o);
		System.out.println("o1 :" +o1);
		System.out.println("o2 :" +o2);
		System.out.println("o3 :" +o3);
		
	}

}
