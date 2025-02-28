
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

public class Exceution_order {
	
	@Test
	public void test1()
	{
		System.out.println("this is test");
	}
	@Test
	public void test10() 
	{
		System.out.println("Test8");
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
	@AfterMethod
	public void test11()
	{
		System.out.println("This is second  after method");
	}
	@BeforeSuite
	public void test5() 
	{
		System.out.println("This is before suite");
	}
	@BeforeSuite
	public void test14() 
	{
		System.out.println("This is second before suite");
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
	@BeforeMethod
	public void test13() 
	{
		System.out.println("THis is second Before Method");
	}
}
