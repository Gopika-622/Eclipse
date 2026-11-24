package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.webdriveruniversity.com/Actions/");
	}
	
	@Test
	public void test1()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag,drop);
		act.perform();
		
		String actualtitle=drop.getText();
		System.out.println(actualtitle);
		String expectedtitle="Dropped!";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
