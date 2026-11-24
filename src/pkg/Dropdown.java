package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
		WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		Select day1=new Select(day);
		day1.selectByValue("09");
		List<WebElement> count=day1.getOptions();
		System.out.println(count.size());
	}
	
	@Test
	public void test2()
	{
		WebElement month=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		Select month1=new Select(month);
		month1.selectByIndex(8);
		List<WebElement> count=month1.getOptions();
		System.out.println(count.size());
	}
	
	@Test
	public void test3()
	{
		WebElement year=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2004");
		List<WebElement> count=year1.getOptions();
		System.out.println(count.size());
	}
	
	

}
