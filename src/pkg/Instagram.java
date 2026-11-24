package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
	}

	@Test
	public void test() throws IOException
	{

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://errorinsta.png"));
		
		WebElement postelement=driver.findElement(By.xpath(""));
		File src2=postelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshot//Elementscreenshot2.png"));
		
	}
}
