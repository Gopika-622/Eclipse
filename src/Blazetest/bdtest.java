package Blazetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Blaze_page.Blazepg;

public class bdtest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void test()
	{
		Blazepg ob=new Blazepg(driver);
		ob.setvalues("Gopika","Claysys","gopika123@gmail.com","gop!k@","gop!k@");
		ob.register();
	}

}
