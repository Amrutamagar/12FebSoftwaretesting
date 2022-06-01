package testClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomclass.PomClassHomePage;
import pomclass.PomMethodLoginpage;


public class TC02LoginHomeTestPage 
{
	@Test
	public void slectionfunctionality() throws InterruptedException, IOException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\driver102\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();
		System.out.println("Browser is Open");
		driver.manage().window().maximize();
		System.out.println("Browser is maximaize");
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("URL is open");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		PomMethodLoginpage loginpage=new PomMethodLoginpage(driver) ;
		loginpage.sendusername();
		loginpage.sendpassword();
		loginpage.clickloginbutton();
	//	ScreenshotClass.takescreenshot(driver);
		
		PomClassHomePage homepage=new PomClassHomePage(driver);
		homepage.clickfilter();
		Thread.sleep(2000);
//		homepage.selectproduct();
//		Thread.sleep(2000);
//		
		homepage.selectproduct();
		System.out.println("Select the Single product");
	//	ScreenshotClass.takescreenshot(driver);
		
		homepage.clickopenmenu();
		System.out.println("select menu button");
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		String Expectedurl="https://www.saucedemo.com/";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(Expectedurl))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}

		homepage.clicklogout();
		System.out.println("succesfully logout");	
		Thread.sleep(2000);
		driver.quit();
		System.out.println("window will close");
		
		
		
		
		
		
		
		
		
	}

}
