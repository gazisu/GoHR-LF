package Setupconfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsersetup {
	public static WebDriver driver;
	
	@BeforeMethod
	
	
	public void browsersetup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	
		
	public void teardown() {
	driver.close();
	driver.quit();
	}
	
		

}
