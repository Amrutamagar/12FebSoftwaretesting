package testClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomclass.PomMethodLoginpage;

public class TC01LoginPageTestClass extends BaseClass
{
	@Test
	
	public void loginfunctinality() throws InterruptedException
	{
		
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Swag Labs";
		Assert.assertEquals(actualtitle, expectedtitle);
		log.info("Test case is pass");
		driver.quit();
		log.info("window is close");
		
		
		
		
		
		
	}

}
