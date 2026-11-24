package pkg;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelink {
	ChromeDriver driver;
String baseurl="https://www.google.com/";
	
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void linkcount() throws Exception
	{
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();

		con.connect();
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(link + "---" + text);

			
		if(con.getResponseCode()==200)
		{
			System.out.println("Valid url");
		}
		else
		{
			System.out.println("Invalid url");
		}
		
	
		}
		
	}
}
	


