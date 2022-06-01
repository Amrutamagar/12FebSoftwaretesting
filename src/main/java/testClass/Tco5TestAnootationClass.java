package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tco5TestAnootationClass extends BaseClass 
{
@Test
public void login() throws InterruptedException
{
	String actualtitle=driver.getTitle();
	String expectedtitle="Swag Labs";
	Thread.sleep(3000);
Assert.assertEquals(actualtitle, expectedtitle);
log.info("Test case pass");
}

}