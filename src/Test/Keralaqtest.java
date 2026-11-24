package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepgm.Keralaquick;


public class Keralaqtest {
	
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
	public void testlogin() 
	{
		Keralaquick ob=new Keralaquick(driver);
		ob.setvalues("Gopika","9778772816","gopika123@gmail.com","hello");
		ob.send();
	}
	
}
