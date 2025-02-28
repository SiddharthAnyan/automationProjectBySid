package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowDemo {

	public static void main(String[] args) {
		
		int age =10;
		
			if(age==15) 
			{
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				System.out.println("Enter in the google");
				driver.quit();
			}
			else 
			{
				throw new ArithmeticException("Age is less than 10");
			}
			
	}
}
