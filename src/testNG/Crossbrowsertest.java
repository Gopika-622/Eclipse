package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertest {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest()
	public void main(String browser)
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
	}
		
		@Test
		public void fb()
		{
			driver.get("https://www.facebook.com/");
		}
		
	}
	
	


