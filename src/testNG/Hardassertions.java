package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertions {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://keralaproperty.in/");
	}
	
	@Test
	public void test1()
	{
		String actual=driver.getTitle();
		String expected="www.facebook.com";
		
		Assert.assertEquals(actual, expected,"title verified");
		System.out.println("Title");
		
	}
	
	@Test
	public void test2()
	{
		WebElement search=driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/form/div/input[2]"));
		boolean searchenable=search.isEnabled();
		
		Assert.assertTrue(searchenable,"it is not enabled");
	}
	

}
