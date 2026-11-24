package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframe {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void test()
	{
		WebElement frame1 =driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		
		WebElement innerframe =driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(innerframe);
		
		WebElement text =driver.findElement(By.tagName("h1"));
		System.out.println(text.getText());
		driver.switchTo().defaultContent();
	}

}
