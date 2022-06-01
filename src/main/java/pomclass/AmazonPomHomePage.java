package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPomHomePage 
{
	private WebDriver driver;
	private Actions act;
	public AmazonPomHomePage(WebDriver driver)
	{
		this.driver=driver;//local variable=global
		PageFactory.initElements( driver,this);
		act=new Actions(driver);
	}
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement movesigninbutton;

	public void movesignin()
	{
		act.moveToElement(movesigninbutton);
	}
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;

	public void ClickonSignoutButton()
	{
		signout.click();
		System.out.println("click signout");
	}
	
	
	
	
	
	
	
	
	
	
	
}
