package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepgm.Keralainitpgm;
//import Pagepgm.Keralapage;

public class Keralainittest {
	
WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	
	@Test
	public void testlogin() 
	{
		Keralainitpgm ob=new Keralainitpgm(driver);
		ob.setvalues("gopika123@gmail.com","gop!k@");
		ob.login();
	}


}
