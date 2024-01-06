package chandra_frame;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class AppUtil1 {
	public static WebDriver driver;
	@BeforeMethod
	public static void SetUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Running precondition",true);
	
	}
	@AfterMethod
	public static void tearDown()
	{
		driver.quit();
		Reporter.log("Running post condition",true);
	}
	
}
