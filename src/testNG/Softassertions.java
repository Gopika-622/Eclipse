package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertions {
	
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://keralaproperty.in/");
	}
	
	@Test
	public void test()
	{
		SoftAssert soft = new SoftAssert();
		String title=driver.getTitle();
		soft.assertEquals(title, "Google","Title is not matching");
		soft.assertTrue(driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]")).isDisplayed(),"login button not displayed");
	    System.out.println("Test execution continues");
	    
	    soft.assertAll();
	}
	

}
