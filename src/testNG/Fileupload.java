package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).sendKeys("D://Gautham_EM001.pdf");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/ul/li/div[1]/button")).click();
	}
	
	

}
