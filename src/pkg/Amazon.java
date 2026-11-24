package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	FirefoxDriver driver;

	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[contains(@id,'twotabsearchtextbox')]")).sendKeys("Mobile");
	}
	
	@Test
	public void carttest()
	{
		driver.findElement(By.xpath("//*[contains@id.'nav-cart')]")).click();
	}
}
