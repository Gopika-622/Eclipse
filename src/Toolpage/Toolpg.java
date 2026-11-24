package Toolpage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class Toolpg {
	
	WebDriver driver;
	
	By enroll=By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/a");
	By fname=By.name("firstName");
	By lname= By.name("lastName");
	By email=By.name("email");
	By mob=By.name("mobile");
	By country=By.name("country");
	By city=By.id("city");
	By msg=By.name("message");
	By code=By.name("code");
	By send=By.xpath("/html/body/div[1]/div[5]/div/div[3]/form/button");
	
	public Toolpg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues (String fstname,String lstname,String Email,String mobile,String Country, String City, String message, String Code)
	{
        driver.findElement(fname).sendKeys(fstname);
		
		driver.findElement(lname).sendKeys(lstname);
		
        driver.findElement(email).sendKeys(Email);
		
		driver.findElement(mob).sendKeys(mobile);
		
        driver.findElement(country).sendKeys(Country);
		
		driver.findElement(city).sendKeys(City);
		
        driver.findElement(msg).sendKeys(message);
		
		driver.findElement(code).sendKeys(Code);
		
	}
	
	public void send()
	{
		driver.findElement(enroll).click();
		
		driver.findElement(send).click();
	}
	
	public void linkcount() throws IOException
	{
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("total no of links = "+links.size());
			
			for(WebElement link:links)
			{
				String url=link.getAttribute("href");
				
				URL ob= new URL(url);
				
				HttpsURLConnection con = (HttpsURLConnection) ob.openConnection();
				
				con.connect();
				
				if(con.getResponseCode()==200)
				{
					System.out.println("valid link");
				}
				else
				{
					System.out.println("invalid link");
				}
				
			}
		}
	
	public void titleverify()
	{
       String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		
		String expectedtitle="Tools";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public void urlverify()
	{
		String actual=driver.getCurrentUrl();
		String expected="www.toolsqa.com";
		
		Assert.assertEquals(actual, expected,"url verified");
		System.out.println("Url");
		
	}
	
	public void screenshot() throws IOException
	{
		
		WebElement scrnshot=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/a[1]/div[1]/div/img"));
		File src=scrnshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Project//Screenshot.png"));
	}
		
	}

	
		
		
	


