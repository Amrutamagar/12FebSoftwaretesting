package testClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomclass.CartPage;
import pomclass.PomClassHomePage;
import pomclass.PomMethodLoginpage;
import org.testng.annotations.Test;

public class TC03CartPageTestClass 
{
	@Test
	public void method1()
	{
		

	System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\driver102\\chromedriver.exe");

	WebDriver driver =  new ChromeDriver();
	System.out.println("Browser is Open");
	driver.manage().window().maximize();
	System.out.println("Browser is maximaize");
	driver.get("https://www.saucedemo.com/");
	
	System.out.println("URL is open");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	PomMethodLoginpage loginpage=new PomMethodLoginpage(driver) ;
	loginpage.sendusername();
	loginpage.sendpassword();
	loginpage.clickloginbutton();
	
	PomClassHomePage homepage=new PomClassHomePage(driver);
	//homepage.clickfilter();
	homepage.selectproduct();
	
	CartPage cart=new CartPage(driver);
	cart.clicktoaddtocart();
	

	String Expectedproduct="1";
	if(cart.clicktoaddtocart().equals(Expectedproduct))
	{
		System.out.println("Test case is pass");
	}
	else
	{
		System.out.println("Test case is fail");
		
	}
	

	}
	
	
	
}

