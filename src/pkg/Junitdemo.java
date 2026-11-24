package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo {
	
	@Before
	public void setup()
	{
		System.out.println("Browser open");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test Activity");
	}
	
	@After
	public void browserclose()
	{
		System.out.println("Browser close");
		
	}
		

}
