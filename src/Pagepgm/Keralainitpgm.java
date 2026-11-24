package Pagepgm;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keralainitpgm {
	
WebDriver driver;
	
	@FindBy(name="ulogin")WebElement KPemail;
	@FindBy(name="upass")WebElement KPpassword;
	@FindBy(id="sub_logbtn")WebElement KPlogin;
	
	
	public Keralainitpgm(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void setvalues(String email,String password)
	{
		KPemail.sendKeys(email);
		KPpassword.sendKeys(password);
		
	}
	
	
	public void login()
	{
		KPlogin.click();
	}

}
