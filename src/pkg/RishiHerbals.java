package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RishiHerbals {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[1]/div[2]/div/ul/li[1]/a/i")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div[2]/div/ul/li[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input")).sendKeys("adhi2816@gmail.com");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[2]/input")).sendKeys("Pk@977877");
		
	}
	

}
