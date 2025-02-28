package practice_one_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Practice1 {
	@Test
	public void test1()
	{
		System.out.println("this is test");
	}
	@BeforeTest
	public void test2() 
	{
		System.out.println("This is before test");
	}
	@BeforeClass
	public void test3() 
	{
		System.out.println("This is before class");
	}
	@AfterMethod
	public void test4()
	{
		System.out.println("This is after method");
	}
	@BeforeSuite
	public void test5() 
	{
		System.out.println("This is before suite");
	}
	@AfterSuite
	public void test6() 
	{
		System.out.println("This is after suite");
	}
	@AfterTest
	public void test7() 
	{
		System.out.println("This is After test");
	}
	@AfterClass
	public void test8() 
	{
		System.out.println("This is After class");
	}
	@BeforeMethod
	public void test9() 
	{
		System.out.println("THis is Before Method");
	}
}


