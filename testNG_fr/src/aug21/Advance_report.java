package aug21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_report {

	
		// Advance report
WebDriver driver;
ExtentReports report;
ExtentTest logger;
@BeforeTest
public void generatereport()

{
	//define path of html report
	report=new ExtentReports("./Reports/gentle.html");
}
@BeforeMethod 
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
}
@Test
public void passtest()
{
//test case start here
	logger=report.startTest("my test pass");
	logger.assignAuthor("Gentle man");
	logger.assignCategory("functional");
	String expected="Google";
	String Actual=driver.getTitle();
	if (expected.equalsIgnoreCase(Actual)) {
	logger.log(LogStatus.PASS,"Title is matching::"+expected+"   "+Actual);	
	}
	else {
		logger.log(LogStatus.FAIL,"Title is not matching::"+expected+"   "+Actual);
	
	}
	}
@Test
public void failtest()
{
	//test case starts here
	logger=report.startTest("my test fail");
	logger.assignAuthor("Gentle man");
	logger.assignCategory("functional");
	String expected="Yahoo";
	String Actual=driver.getTitle();
	if (expected.equalsIgnoreCase(Actual)) {
		logger.log(LogStatus.PASS,"Title is matching::"+expected+"  "+Actual);
	}
	else 
		logger.log(LogStatus.FAIL,"Title is not matching::"+expected+"  "+Actual);
	}
	@AfterMethod
	public void tearDown()
		{
	//to end logging repspect to html
		report.endTest(logger);
		report.flush();
		driver.quit();
	}
}
	


