package August16;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class UsingDataProvider {
	WebDriver driver;
	 @BeforeTest
	  public void setUp() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	  }
  @Test(dataProvider = "dp")
  public void  verify_login(String user , String pass) {
	  driver.get("http://orangehrm.qedgetech.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys(user);
	  driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys(pass);
	  driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
	  String expected="dashboard";
	  String Actual=driver.getCurrentUrl();
	  if(Actual.contains(expected))
	  {
		  Reporter.log("Login success::"+expected+"  "+Actual,true);
	  }
	  else {
		
	}
	  Reporter.log("Login fail::"+expected+"  "+Actual,true);	
	
	}
	   
	  
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
  {  
  }

  @AfterTest
  public void tearDown() {
	  driver.quit();
  }

}
