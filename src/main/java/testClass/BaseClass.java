package testClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import pomclass.PomClassHomePage;
import pomclass.PomMethodLoginpage;

public class BaseClass 
{
	WebDriver driver;
	Logger log =Logger.getLogger("SauceDemo1");
	@Parameters("browsername")
@BeforeMethod
public void loginfunctionality(String browsername ) throws InterruptedException
{
		if(browsername.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\driver102\\chromedriver.exe");

	driver =  new ChromeDriver();
		}
	 
		PropertyConfigurator.configure("log4j.properties");
	log.info("Browser is Open");
	
	driver.manage().window().maximize();
	log.info("Browser is maximaize");
	driver.get("https://www.saucedemo.com/");
	log.info("URL is open");
	
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	PomMethodLoginpage loginpage=new PomMethodLoginpage(driver) ;
	loginpage.sendusername();
	log.info("Send the Username");
	
	Thread.sleep(2000);
	loginpage.sendpassword();
	log.info("Send the Password");
	Thread.sleep(2000);
	
	loginpage.clickloginbutton();
	log.info("click the login button");
	PomClassHomePage homepage=new PomClassHomePage(driver);
	homepage.clickopenmenu();
	log.info("select menu button");
	
	Thread.sleep(2000);
	homepage.clicklogout();
	log.info("succesfully logout");
	
}
@AfterMethod
public void logoutmethod()
{driver.quit();
log.info("window will close");
}
	
}

