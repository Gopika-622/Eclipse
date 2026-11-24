package Pagepgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keralapage {
	
WebDriver driver;
	
	By kpemail=By.name("ulogin");
	By kppass=By.name("upass");
	By kplogin=By.id("sub_logbtn");
	
	
	public Keralapage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void setvalues(String email,String password)
	{
		driver.findElement(kpemail).sendKeys(email);
		
		driver.findElement(kppass).sendKeys(password);
		
	}
	
	
	public void login()
	{
		driver.findElement(kplogin).click();
	}
	

}
