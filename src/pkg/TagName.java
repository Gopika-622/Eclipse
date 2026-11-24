package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(link + "---" + text);
		}
	}

}
