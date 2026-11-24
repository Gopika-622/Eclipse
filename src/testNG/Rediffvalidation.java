package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffvalidation {
	
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
		WebElement logo= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		
		if(logo.isDisplayed())
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
	}
	
	@Test
	public void test2()
	{
		WebElement radio=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[1]/input"));
		
		if(radio.isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	
	}
	
	@Test
	public void test3()
	{
		WebElement check=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[15]/div/input"));
		
		if(check.isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	}
	

}
