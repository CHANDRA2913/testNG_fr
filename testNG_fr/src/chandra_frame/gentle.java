package chandra_frame;

import java.sql.Driver;

import javax.xml.datatype.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class gentle {
	
	public static WebDriver driver;
	@BeforeTest
	public static void setup() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("http://primusbank.qedgetech.com/");
	 driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	 Reporter.log("Running precondition",true);
	}
	 
	
	@AfterTest
	public static void tearDown() {
	Reporter.log("Running postcondition",true);
	driver.quit();
	

}
}