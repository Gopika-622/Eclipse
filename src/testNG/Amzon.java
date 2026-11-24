package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amzon {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Moblie Phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
	}

}
