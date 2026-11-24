package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cakehut {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cakehut.in/");
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		String expectedtitle="Cakehutt";
       
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
		driver.get("https://www.cakehut.in/x-mas-new-year-cakes");
		String actualcontent =driver.getPageSource();
				String expectedcontent="Price";
		
		if(actualcontent.contains(expectedcontent))
		{
			System.out.println("Page contains price");
		}
		else
		{
			System.out.println("Page does not price");
		}
	}

}
