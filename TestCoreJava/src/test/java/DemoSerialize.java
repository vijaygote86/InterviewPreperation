package src.test.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoSerialize implements Serializable{
	
	private static final long serialversionUID = 129348938L;
	
	public int a;
	public String b;
	static int staticAmount = 1000;
	
	public DemoSerialize(int a, String s)
	{
		this.a = a;
		this.b = s;
	}
	
	public void setB(String b)
	{
		this.b = b;
	}
	
	public static void main(String[] args) {
		
		DemoSerialize obj = new DemoSerialize(1, "Vijay");
		String fileName = "file.txt";
		
		//Serialization
		try{
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(obj);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");
			
			System.out.println("Data before deserialization: " +obj.a);
			System.out.println(obj.b);
			System.out.println("staticAmount =" +obj.staticAmount);
			obj.staticAmount = 2000;
			obj.setB("Rahul");
			System.out.println(obj.b);
			
		}
		catch(IOException ex)
		{
			System.out.println("IOException occred");
		}
	
		//Deserialization
		
		try
		{
			DemoSerialize obj1 = null;
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			obj1 = (DemoSerialize)in.readObject();
			
			in.close();
			fileIn.close();
			
			System.out.println("Object has been deserialized");
			System.out.println("a= "+obj1.a);
			System.out.println("b= "+obj1.b);
			System.out.println("staticAmount = " +obj1.staticAmount);
		}
		catch(IOException ex)
		{
			System.out.println("IOException Occured");
		}
		catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException Occured");
		}
	}
}
