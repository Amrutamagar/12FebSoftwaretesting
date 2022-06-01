package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
private WebDriver driver;

public CartPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//a[contains(@class,'shopping_cart_link')]")
	private WebElement cart;
	
	public String clicktoaddtocart()
	{
		cart.click();
		String a=cart.getText();
		
		return a;
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement countinues;
	
	public void clicktocountinues()
	{
		countinues.click();
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	public void clicktocheckout()
	{
		checkout.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement remove ;
	
	public void clicktoremove()
	{
		remove.click();
	}
	
	
	
	
	
	
	
	
	
}
