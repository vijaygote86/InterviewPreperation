package src.test.java;

public  class SameNameMethodInterfaces implements Interface1, Interface2{

	@Override
	public void display() {

		System.out.println("Hello!");
		
	}
	
	public static void main(String[] args) {
		
		
		SameNameMethodInterfaces sn = new SameNameMethodInterfaces();
		sn.display();
	}


}
