package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

   public class Rediff {
   ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[2]/input")).sendKeys("Gopika");
		driver.findElement(By.xpath("//form[@name='register_mail']/div/div[3]/div/input")).sendKeys("gopikams622");
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("!O#5@g789");
	}
	
	@Test
	public void textverification()
	
	{
		String a=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[20]/input")).getAttribute("value");
		System.out.println(a);
	}
	
}
