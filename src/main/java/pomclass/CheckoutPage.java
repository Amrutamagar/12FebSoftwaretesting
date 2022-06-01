package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname;
	 public void clickfirstname()
	 {
		 firstname.sendKeys("Amruta");
	 }
	 
	 @FindBy(xpath="//input[@name='lastName']")
		private WebElement lastname;
		 public void clicklastname()
		 {
			 lastname.sendKeys("Magar");
		 }
		
		 @FindBy(xpath="//input[@name='postalCode']")
			private WebElement zipcode;
			 public void clickzipcode()
			 {
				 zipcode.sendKeys("413001");
			 }
			 
			 @FindBy(xpath="//input[@name='continue']")
				private WebElement countines;
				 public void clickcountines()
				 {
					 countines.click();;
				 }	 
			 
		 @FindBy(xpath="//button[@name='cancel']")
					private WebElement cancel;
					 public void clickcancel()
					 {
						 cancel.click();
					 }	 
				 	 
			 
			 
			 
			 
			 
			 
			 
	
	
}
