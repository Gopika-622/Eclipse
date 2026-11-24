package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoGuru {
	
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void test1()
	{
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(right);
		act.perform();
		driver.findElement(By.xpath("/html/body/ul/li[1]/span")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		
		WebElement dc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act1=new Actions(driver);
		act1.doubleClick(dc);
		act1.perform();
		Alert b=driver.switchTo().alert();
		b.accept();
		
		
		
		
	}

}
