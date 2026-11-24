package testNG;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {

	ChromeDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://error10.png"));
	}
	
	@Test
	public void test2()
	{
        String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		
		String expectedtitle="Facebook";
		
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
		public void test3()
		{
			List<WebElement>li=driver.findElements(By.tagName("a"));
			System.out.println(li.size());
			
			for(WebElement s:li)
			{
				String link=s.getAttribute("href");
				String text=s.getText();
				System.out.println(link + "---" + text);
			}
	}
	}

