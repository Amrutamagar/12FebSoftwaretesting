package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(utilityClass.LisnersClass.class)
public class SampleListernerClass1 
{public WebDriver driver;
//@Test
//public void verifyloginURL()
//{
//	Assert.assertTrue(true);
//	//System.out.println("URL is passed");
//	}
//@Test
//public void verifyloginTittle()
//{
//	Assert.assertTrue(false);
//	System.out.println("Title is Failed");
//	}
@Test
public void verifyTitle()
{
	System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\driver102\\chromedriver.exe");

	driver =  new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Assert.assertTrue(false);
	}






}
