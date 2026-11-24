package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/gopika/OneDrive/Documents/alert.html");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String p=a.getText();
		if(p.contains("Hello! I am an alert box"))
		{
			System.out.println("Contains");
		}
		else
		{
			System.out.println("Not contains");
		}
		a.accept();
		
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("xyz");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc");
	}

}
