package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		int age =10;
		
		if(age>15) 
		{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.quit();
		}
		else 
		{
			System.out.println("Error");
		}
	}
	

}
