package practice_one_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Execution_Order2 
{
//BM, BS, AC, Test, Test
	
	@BeforeMethod
	public void BM() 
	{
		System.out.println("This is Before Method");
	}
	
	@BeforeSuite
	public void BS() 
	{
		System.out.println("This is Before Suite");
	}
	
	@AfterClass
	public void AC() 
	{
		System.out.println("This is After Class");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test2");
	}
	
}
