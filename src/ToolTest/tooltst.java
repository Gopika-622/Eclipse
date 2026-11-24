package ToolTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Toolpage.Toolpg;

public class tooltst {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://toolsqa.com/");
	}
	
	@Test
	public void test()
	{
		Toolpg ob=new Toolpg(driver);
		ob.setvalues("Gopika","M S","haii123@gmail.com","9988776655","India","Delhi","Hellooo","uzih");
		ob.send();
	}
	
	@Test
	public void test2() throws IOException
	{
		Toolpg ob=new Toolpg(driver);
		ob.linkcount();
	}
	
	@Test
	public void test3()
	{
		Toolpg ob= new Toolpg(driver);
		ob.titleverify();
	}
	
	@Test
	public void test4()
	{
		Toolpg ob= new Toolpg(driver);
		ob.urlverify();
	}
	
	@Test
	public void test5() throws IOException
	{
		Toolpg ob=new Toolpg(driver);
		ob.screenshot();
	}
	

}
