package testClass;

import org.testng.annotations.Test;

public class Practice 
{
//	@Test(priority=-2)
//	public void testE()
//	{
//		System.out.println("Test E");
//	}
//	
//	@Test(priority=-1)
//	public void testT()
//	{
//		System.out.println("Test T");
//	}
//	
//	@Test(priority=0)
//	public void testU()
//	{
//		System.out.println("Test U");
//	}
//	
//	@Test(priority=1)
//	public void testM()
//	{
//		System.out.println("Test M");
//	}
//
//	@Test(priority=2)
//	public void testA()
//	{
//		System.out.println("Test A");
//	}
	@Test(invocationCount=5)
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@Test(priority=1, invocationCount =2)
	public void testB()
	{
		System.out.println("Test B");
	}
	
	@Test(priority=-1, invocationCount =2)                //by default 1
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@Test (invocationCount=0)         //will not be executed
	public void testD()
	{
		System.out.println("Test D");
	}

	@Test(invocationCount=-1)       //will not be executed
	public void testE()
	{
		System.out.println("Test E");
	}


}
