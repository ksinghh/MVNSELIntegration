package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {
	@Test
	public static void meth() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.gmail.com");
		 
		// Close browser
		driver.close();	
	}
}
