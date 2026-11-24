package Blaze_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazepg {
	
	WebDriver driver;
	
	By bdname=By.name("name");
	By bdcmpny=By.name("company");
	By bdemail=By.name("email");
	By bdpassw=By.name("password");
	By bdpasscon=By.name("password_confirmation");
	By bdregister=By.xpath("/html/body/div[1]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazepg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpassword)
	{
        driver.findElement(bdname).sendKeys(name);
		
		driver.findElement(bdcmpny).sendKeys(company);
		
        driver.findElement(bdemail).sendKeys(email);
		
		driver.findElement(bdpassw).sendKeys(password);

		driver.findElement(bdpasscon).sendKeys(confirmpassword);
		
	}
	
	public void register()
	{
		driver.findElement(bdregister).click();
	}

}
