package pomclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomClassHomePage
{
	private WebDriver driver;
	
	
	public PomClassHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement product;
	
	public String selectproduct()
	{
		String a=product.getText();
		return a;
	}
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement openmenu;
	public void clickopenmenu()
	{
		openmenu.click();
	}
	
	@FindBy(xpath="//a[text()='About']")
	private WebElement about;
	
	public void clickabout()
	{
		about.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public void clicklogout()
	{
		logout.click();
	}
	
	@FindBy(xpath="//select[contains(@class,'product_sort_container')]")
	private WebElement filter;
	
	public void clickfilter()
	{
		Select s=new Select(filter);
		s.selectByValue("za");					
	}			
				
				
				
				
				
				
				
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	

}
