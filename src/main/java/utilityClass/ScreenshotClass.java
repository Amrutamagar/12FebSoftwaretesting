package utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
public static void takescreenshot(WebDriver driver) throws IOException
{
	//Date Format
	Date d=new Date();
	DateFormat da= new SimpleDateFormat("DD-MM-YY & HH-MM-SS");
	String d1=da.format(d);
			
			//Screenshot
	TakesScreenshot take=(TakesScreenshot)driver;
	File Souce=take.getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\Automation Testing\\Screenshots\\homescreen"+d1+".jpg");
	FileHandler.copy(Souce, dest);	
	System.out.println("screenshot is taken");
			
}
}



	
	
	
	
	
	
	
	
	
	

