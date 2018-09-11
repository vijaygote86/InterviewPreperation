


import static org.junit.Assert.*;
/**
 * assserArrayEquals
 * assertEquals
 * assertFalse
 * assertNotNull
 * assertNull
 * assertSame
 * assertThat
 * assertTrue
 * fail
 * 
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLogic2 {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("before class");
	}
	
	@Before
	public void setUp() throws Exception
	{
		System.out.println("before");
	}
	
	@Test
	public void findMax()
	{
		System.out.println("test case find max");
		assertEquals(12, Calculation.findMax(new int[]{4,5,2,3,12,1,6,8}));
	}
	
	@Test
	public void findCube()
	{
		System.out.println("test case find cube");
		assertEquals(9, Calculation.findCube(3));
	}
	
	@Test
	public void findReverse()
	{
		System.out.println("test case find reverse");
		assertEquals("ym eman si nahk", Calculation.findReverseString("My name is khan"));
	}
	
	@After
	public void tearDown()
	{
		System.out.println("after");
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("After Class");
	}
	
}
