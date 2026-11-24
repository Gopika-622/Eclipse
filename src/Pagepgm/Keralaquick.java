package Pagepgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keralaquick {
	
WebDriver driver;
	
	By kpname=By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[1]/input");
	By kpphone=By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[2]/input");
	By kpemail=By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[3]/input");
	By kpmessage=By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/div[4]/textarea");
	By kpsend=By.xpath("/html/body/div[4]/div/div[3]/div[1]/form/input");
	
	
	public Keralaquick(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void setvalues(String name,String phone,String email,String message)
	{
		driver.findElement(kpname).sendKeys(name);
		
		driver.findElement(kpphone).sendKeys(phone);
		
		driver.findElement(kpemail).sendKeys(email);
		
		driver.findElement(kpmessage).sendKeys(message);
	}
	
	
	public void send()
	{
		driver.findElement(kpsend).click();
	}
	

}
