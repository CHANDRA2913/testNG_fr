package August17;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Using_PropertyFile1 {
	Properties conPro;
	WebDriver driver;
	@Test
	public void statTest()throws Throwable
	{
		conPro.load(new FileInputStream("login.properties"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(conPro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(conPro.getProperty("Objuser"))).sendKeys(conPro.getProperty("enteruser"));
		driver.findElement(By.xpath(conPro.getProperty("Objpass"))).sendKeys(conPro.getProperty("enterpass"));
		driver.findElement(By.xpath(conPro.getProperty("Objlogin")));
		driver.quit();
	}

}
 