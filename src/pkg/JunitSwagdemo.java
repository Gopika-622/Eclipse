package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSwagdemo {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	
	}
	
	@Test
	public void logintest()
	{
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test
	public void titletest()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Lab";
       
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		@Test
		public void nametest()
		{
			String actualcontent =driver.getPageSource();
			String expectedcontent="Swag Labs";
	
	if(actualcontent.contains(expectedcontent))
	{
		System.out.println("Page contains Swag Labs");
	}
	else
	{
		System.out.println("Page doesn't contains Swag Labs");
	}
		
		
	}
	

}
