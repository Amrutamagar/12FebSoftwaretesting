package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomMethodLoginpage 
{
private WebDriver driver;
public PomMethodLoginpage(WebDriver driver)
{
	this.driver=driver;//local variable=global
	PageFactory.initElements( driver,this);
	}

@FindBy(xpath="//input[@id='user-name']")
private WebElement username;

public void sendusername()
{
	username.sendKeys("standard_user");
	}

@FindBy(xpath="//input[@id='password']")
private WebElement password;
public void sendpassword()
{
	password.sendKeys("secret_sauce");
	}

@FindBy(xpath="//input[@id='login-button']")
private WebElement login;

public void clickloginbutton()
{
	login.click();
	}














	
	
}
