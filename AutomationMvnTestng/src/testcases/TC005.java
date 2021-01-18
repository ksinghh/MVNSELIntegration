package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC005 {
	@Test
	public static void meth() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://qab.rci.com");
		//login to RCI
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"sidebar-toggle\"]"));
		menu.click();
		 
		// Close browser
		driver.close();	
	}
}
