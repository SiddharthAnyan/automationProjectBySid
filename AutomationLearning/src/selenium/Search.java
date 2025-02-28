package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	static int  age =20;
	
	public static void eligible() 
	{
		if (age < 18) 
		{
			throw new ArithmeticException("Invalid Age:  Please input valid age");
			
		}	
		else 
		{
			System.out.println("User has valid age :  Login");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
	try 
	{
		eligible();
	}
	catch(ArithmeticException e) 
	{
		System.out.println("Print Exception : "+e.getMessage());
		return;  // Exit from a method
	
	}
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("q")).sendKeys("Cricbuzz");
	 Thread.sleep(2000);
	 driver.quit();
	 System.out.println("Test case Execute Successfully!!!!!!!!!");
	
	}
}
