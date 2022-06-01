package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPomLoginPage 
{
private WebDriver driver;
public AmazonPomLoginPage(WebDriver driver)
{
	this.driver=driver;//local variable=global
	PageFactory.initElements( driver,this);
}
@FindBy(xpath="(//span[text()='Sign in'])[2])]")
private WebElement signin;

public void signclick()
{
	signin.click();	
}
@FindBy(xpath="//input[@id='ap_email']")
private WebElement username;

public void sendusername()
{
	username.sendKeys("8149661139");	
}
@FindBy(xpath="//input[@id='continue']")
private WebElement counties;

public void ClickoncountiesButton()
{
	counties.click();;	
}
@FindBy(xpath="//input[@id='ap_password']")
private WebElement password ;

public void sendpassword()
{
	password.sendKeys("22101992");	
}
@FindBy(xpath="//input[@id='signInSubmit']")
private WebElement sumbit;

public void ClickonbuttonButton()
{
	sumbit.click();;	
}





}
