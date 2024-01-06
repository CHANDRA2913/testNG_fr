package chandra_frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class Apputil2 {
	public static WebDriver driver;
	@BeforeSuite
public static void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Running before suite",true);
	}
		@AfterSuite
		public static void teardown()
		{
			driver.quit();
			Reporter.log("Running after suite",true);
			
		}
		
		
		
	}
	


