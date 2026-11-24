package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp {
	
	ChromeDriver driver;
	
	@Before
	public void setup()	
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	@Test
	public void alerttest()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		if(s.equals("I am a JS Alert"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		a.accept();
	}
		
		@Test
		public void test2()
		{
			driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
			Alert a=driver.switchTo().alert();
			String s=a.getText();
			if(s.equals("I am a JS Confirm"))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			a.accept();
		}
		
		@Test
		public void test3()
		{
			driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
			Alert b=driver.switchTo().alert();
			String r=b.getText();
			if(r.equals("I am a JS prompt"))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			b.sendKeys("Hello World");
			b.accept();
	
		}
	}


