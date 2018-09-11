package junit.poc;


import static org.junit.Assert.*;
import org.junit.Test;

public class TestLogic {
	
	@Test
	public void testFindMax()
	{
		assertEquals(9, Calculation.findMax(new int[]{1,2,3,4,5,6,7,8,9}));
	}

}
