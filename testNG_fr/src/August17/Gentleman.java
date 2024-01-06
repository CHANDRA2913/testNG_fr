package August17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gentleman {
WebDriver driver;
@Test
public void checktitle()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String expected="yahoo";
	String Actual=driver.getTitle();
	try {
		Assert.assertEquals(expected , Actual,       "Title is not matching");
	}catch(Throwable t)
	{
		System.out.println(t.getMessage());
	}
	driver.quit();
	}
}

