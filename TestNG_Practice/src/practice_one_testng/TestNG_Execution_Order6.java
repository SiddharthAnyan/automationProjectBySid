package practice_one_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Execution_Order6 {
	
	//Test, BT, AT, AC, BC, BS 
	
	@Test
	public void test() 
	{
		System.out.println("This is test");
	}

	@BeforeTest
	public void BT() 
	{
		System.out.println("This is Before  test");
	}
	@AfterTest
	public void AT() 
	{
		System.out.println("This is After test");
	}
	@AfterClass
	public void AC() 
	{
		System.out.println("This is After Class");
	}
	@BeforeClass
	public void BC() 
	{
		System.out.println("This is Before Class");
	}
	
	@BeforeSuite
	public void  BS() 
	{
		System.out.println("This is before Suite");
	}

}

