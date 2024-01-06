package mouli_frame;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import chandra_frame.AppUtil1;

public class SecondtestNG extends  AppUtil1{
	@Test
	public void Addition()
	{
		driver.findElement(By.name("display")).sendKeys("98765");
		driver.findElement(By.xpath("(//input[@value='+'])[1]")).click();
		driver.findElement(By.name("display")).sendKeys("8765");
		driver.findElement(By.xpath("(//input[@value='='])[1]")).click();
		//capture results value
		String Address = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(Address+"  "+"Executing Addition Test",true);
			
	}
@Test
public void multiplication()
{
	driver.findElement(By.name("display")).sendKeys("9618");
	driver.findElement(By.xpath("(//input[@value='x'])[1]")).click();
	driver.findElement(By.name("display")).sendKeys("2029");
	driver.findElement(By.xpath("(//input[@value='='])[1]")).click();
	//capture results value
			String Address=driver.findElement(By.name("display")).getAttribute("value");
			Reporter.log(Address+"  "+"Executing multiplication Test",true);

}
@Test
public void division()
{
	driver.findElement(By.name("display")).sendKeys("824737");
	driver.findElement(By.xpath("(//input[@value='/'])[1]")).click();
	driver.findElement(By.name("display")).sendKeys("56");
	driver.findElement(By.xpath("(//input[@value='/'])[1]")).click();
	//capture results value
			String Address=driver.findElement(By.name("display")).getAttribute("value");
			Reporter.log(Address+"  "+"Executing division Test",true);

}

}
