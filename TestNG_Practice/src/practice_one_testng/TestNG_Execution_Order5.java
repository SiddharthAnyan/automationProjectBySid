package practice_one_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Execution_Order5 
{
	//BS, AS, BC, AC, BT, Test, Test, Test
	
	@BeforeSuite
	public void BS() 
	{
		System.out.println("This is Before Suite");
	}
	@AfterSuite
	public void AS() 
	{
		System.out.println("This is After Suite");
	}
	@BeforeClass
	public void BC() 
	{
		System.out.println("This is Before Class");
	}
	@AfterClass
	public void AC() 
	{
		System.out.println("This is After Class");
	}
	@BeforeTest
	public void BT() 
	{
		System.out.println("This is Before Test");
	}
	@Test
	public void Test1() 
	{
		System.out.println("This is Test1");
	}
	@Test
	public void Test2() 
	{
		System.out.println("This is test2");
	}
	@Test
	public void Test3() 
	{
		System.out.println("This is test3");
	}
	
}
