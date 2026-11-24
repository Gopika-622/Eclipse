package pkg;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ninja {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void acctest()
	{
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
	}
	
	@Test
	public void test2()
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Adithya");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("P K");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("adhi2827@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("9988776543");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Pk@977877");
		driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("Pk@977877");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
	}
	
	@Test
	public void test3() throws IOException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		WebElement email=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input"));
		File src2=email.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshot//Elementscreenshot2.png"));
	}
	
	

}
