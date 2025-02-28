package practice_one_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Execution_Order7 
{
//BS, BC, BM, Test, AM, Test, AT
	
	@BeforeSuite
	public void BS() 
	{
		System.out.println("This is Before Suite");
	}
	@BeforeClass
	public void BC() 
	{
		System.out.println("This is Before Class");
	}
	@BeforeMethod
	public void BM() 
	{
		System.out.println("This is Before Method");
	}
	@Test
	public void Tes() 
	{
		System.out.println("This is Test");
	}
	@AfterMethod
	public void AM() 
	{
		System.out.println("This is After Method");
	}
	@Test
	public void test2() 
	{
		System.out.println("This is Before Method");
	}
	@AfterTest
	public void AT() 
	{
		System.out.println("This is After test");
	}
	
}
