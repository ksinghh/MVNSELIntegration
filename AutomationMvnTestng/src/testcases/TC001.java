package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
	@Test
	public static void meth() {
	System.setProperty("webdriver.chrome.driver", "C:/Users/abhis/eclipse-newworkspace/MySeleniumSept2020/drivers/ChromeDriver/chromedriver_win32 (6)/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		 
		// Close browser
		driver.close();	
	}
}
