package mouli_frame;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import chandra_frame.Apputil2;

public class Thirdtestng extends Apputil2 {
	@Test
	public void clickadmin()
	{
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Reporter.log("Executing Admin test",true);
		
	}
@Test
public void clickpim()
{
driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
Reporter.log("Executing pim test",true);

}
@Test
public void clickleave()
{
	driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
	Reporter.log("Executing leave test",true);	
}
}

