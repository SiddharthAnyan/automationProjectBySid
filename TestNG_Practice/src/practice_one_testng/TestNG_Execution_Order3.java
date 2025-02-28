package practice_one_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Execution_Order3 
{
	//BT,AT,AM,BS,Test,Test
	
	@BeforeTest
	public void BT() 
	{
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void AT() 
	
	{
		System.out.println("This is After Test");
	}
	
	@AfterMethod
	public void AM() 
	{
		System.out.println("This is After Method");
	}
	
	@BeforeSuite
	public void BS() 
	{
		System.out.println("This is Before Suite");
	}
	
	@Test
	public void Test1() 
	{
		System.out.println("This is test1");
	}
	
	@Test
	public void Test2() 
	{
		System.out.println("This is test2");
	}
	
}
