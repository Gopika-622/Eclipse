package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoguru {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.guru99.com/test/drag_drop");
	}
	
	/*@Test
	public void test1()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"credit2\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
		}
	
		
	@Test
	public void test2()
		{
		WebElement d=driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement r=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(d, r);
		act.perform();
		}
		
		
	@Test
	public void test3()
	{
		WebElement a=driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"loan\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(a, b);
		act.perform();
	   }*/
	
	@Test
	public void test4()
	{
		WebElement x=driver.findElement(By.xpath("//*[@id=\"fourth\"]"));
		WebElement y=driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(x, y);
		act.perform();
	}
	
	}


