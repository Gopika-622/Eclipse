package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	public void set()
	{
		System.out.println("Browser launch");
	}
	
	@BeforeMethod
	public void url()
	{
		System.out.println("url open");
	}
	
	@Test(priority=2,dependsOnMethods= {"test2"})
	public void test()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=1,enabled=false)
	public void test1()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=3,invocationCount=2)
	public void test2()
	{
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void aftertest()
	{
		System.out.println("Report");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("Close");
	}

}
