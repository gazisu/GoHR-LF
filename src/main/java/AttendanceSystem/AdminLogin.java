package AttendanceSystem;


import org.openqa.selenium.By;

import Setupconfiguration.Browsersetup;

public class AdminLogin extends Browsersetup{
	
	
	@BeforeMethod
	void Browser () {
		
		driver.get("https://celbd.com/lifungtest/#/login");
		
		
	}
	
	@AfterMethod
	
	void browserclean() {
		driver.close();
		driver.quit();
	}

	@Test
	
	
	void logintest() {
		driver.findElement(By.xpath("/html/body/app-root/app-main/app-login/html/body/div[2]/form/div[1]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("/html/body/app-root/app-main/app-login/html/body/div[2]/form/div[2]/input")).sendKeys("x");
		driver.findElement(By.xpath("/html/body/app-root/app-main/app-login/html/body/div[2]/form/button")).click();
		
	}
	
}
