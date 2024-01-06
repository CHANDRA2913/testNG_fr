package mouli_frame;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import chandra_frame.gentle;

public class August12_2 extends gentle {
	@Test
	public void pbanking()
	{
		driver.findElement(By.xpath("(//img)[4]")).click();
		Reporter.log("Executing pbanking test",true);
	
	}
	@Test
	public void ibanking() {
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing ibanking test",true);
}
		@Test
		public void cbanking() {
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Executing cbanking test",true);
	}

}
