package utilityClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import pomclass.SampleListernerClass1;



public class LisnersClass implements ITestListener 
{WebDriver driver;
public void onStart(ITestResult result)
{
	System.out.println("test case excution is started");
	}
public void onFinish(ITestResult result)
{
	System.out.println("test case excution is Finished");
	}
public void onTestSuccess(ITestResult result)
{
	System.out.println("Test case is succesfully passed");
	}
public void onTestFailure(ITestResult result)
{
	System.out.println("test case is failed and hence take screenshot");
this.driver=((SampleListernerClass1)result.getInstance()).driver;
	TakesScreenshot take=(TakesScreenshot)driver;
	File Souce=take.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshot/login.jpg");
	try 
	{
		FileHandler.copy(Souce, dest);
	} 
	catch (IOException e) 
	{
		
		e.printStackTrace();
	}
	}

public void onTestStart(ITestResult result)
{
	System.out.println("Sanity test is start");
	}






}
