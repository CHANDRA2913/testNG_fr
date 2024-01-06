package august16_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross {
	WebDriver driver;
	@Parameters({"Browser"})
	 @BeforeTest()
	  public void setUp(String brw ) {
		switch(brw) {
		
		
		case "chrome":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
			default:
				System.out.println("Browser value is Not Matching");
				break;
		}}
	  
 @Test(dataProvider ="dp")
 public void  verify_login(String user , String pass) {
	  driver.get("http://orangehrm.qedgetech.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  driver.findElement(By.cssSelector("#txtUsername")).sendKeys(user);
	  driver.findElement(By.cssSelector("#txtPassword")).sendKeys(pass);
	  driver.findElement(By.cssSelector("#btnLogin")).click();
	  String expected="dashboard";
	  String Actual=driver.getCurrentUrl();
	  if(Actual.contains(expected))
	  {
		  Reporter.log("Login success::"+expected+"  "+Actual,true);
	  }
	  else {
		
	
	  Reporter.log("Login fail::"+expected+"  "+Actual,true);	
	
	}}
	   
	  
 @DataProvider
 public Object[][] dp() {
	 Object login[][]=new Object [5][2];// fiverows and 2cells
	login[0][0]="Admin";
	login[0][1]="Qedge123!@#"; 	  
 login[1][0]="Admin";
 login[1][1]="Qedge123!@#";
 login[2][0]="test";
 login[2][1]="Qedge123!@#";
 login[3][0]="Admin";
 login[3][1]="Qedge123!@#";
 login[4][0]="Admin";
 login[4][1]="Qedge123!@#";
 return login;
 }
  
 

 @AfterTest
 public void tearDown() {
	  driver.quit();
}}



