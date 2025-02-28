package practice_one_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Execution_Order1
{
//BS,BM,AM,Test,Test,AC
	
	@BeforeSuite
	public void BS() 
	{
		System.out.println("This is Before Suite");
	}
	@BeforeMethod
	public void BM() 
	{
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void AM() 
	{
		System.out.println("This is After Method");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("This is test1");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("This is test2");
	}
	@AfterClass
	public void AC() 
	{
		System.out.println("This is After class");
	}
}
