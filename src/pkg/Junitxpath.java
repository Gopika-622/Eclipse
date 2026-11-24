package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitxpath {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='ulogin']")).sendKeys("gopika123@gmail.com");
		driver.findElement(By.xpath("//input[@name='upass']")).sendKeys("gop!k@");
		driver.findElement(By.xpath("//input[@id='sub_logbtn']")).click();
	}

}
