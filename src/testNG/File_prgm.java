package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_prgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@Test
	public void test1() throws AWTException
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[3]/a")).click();
		fileupload("D:\\Gautham_EM001.pdf");
	}
	
	public void fileupload(String p) throws AWTException
	{
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
