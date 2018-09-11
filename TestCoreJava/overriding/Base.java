package overriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Base {
	
	public void display() throws IOException
	{
		System.out.println("Base Class");
	}

}

class child extends Base
{
	public void display() throws FileNotFoundException
	{
		
	}
}
