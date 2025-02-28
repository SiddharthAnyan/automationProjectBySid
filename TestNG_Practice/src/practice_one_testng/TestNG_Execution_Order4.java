package practice_one_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Execution_Order4
{
	//BS,AS, BT, AT, BC
	
@BeforeSuite
public void BS() 
{
	System.out.println("This is Before Suite");
}
	
@AfterSuite

public void AS()
{
	System.out.println("THis is After Suite");
}

@BeforeTest
public void BT() 
{
	System.out.println("This is before test");
}

@AfterTest
public void AT()
{
	System.out.println("This is After Test");
}

@AfterClass
public void BC() 
{
	System.out.println("This is Before Class");
}


}
