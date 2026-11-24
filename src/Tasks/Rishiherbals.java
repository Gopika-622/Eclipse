package Tasks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherbals {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://rishiherbalindia.linker.store");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[2]/a")).click();
	}
	
	@Test
	public void test2()
	{
		String actual=driver.getTitle();
		String expected="Herbal Products | Rishi Herbal India";
		
		Assert.assertEquals(actual, expected,"Title verified");
	}
	
	@Test
	public void test3()
	{
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/column[1]/div[2]/div[2]/form/div[2]/div[2]/div[2]/ul/li/label/input")).click();
	}
	
	@Test
	public void test4()
	{
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[3]/div[2]/div[1]/form/div[1]/div/input")).sendKeys("Super health");
	}
	
	@Test
	public void test5() throws IOException
	{
		WebElement baby=driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[6]/a"));
		File src=baby.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//baby.png"));
	}
	
	@Test
	public void test6()
	{
		WebElement asc=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div[2]/div[3]/div/div[2]/form/select"));
		Select sob=new Select(asc);
		sob.selectByValue("alphabet-asc");
	}
	
	@Test
	public void test7()
	{
		driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[4]/a")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement aloe=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a"));
		js.executeScript("arguments[0].scrollIntoView(true);",aloe);
	}


}
