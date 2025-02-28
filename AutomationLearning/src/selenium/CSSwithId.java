package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSwithId {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement SearchwithId=driver.findElement(By.cssSelector("#APjFqb"));
		SearchwithId.sendKeys("Cricket");
		System.out.println("CSS with id is working fine");
		
		driver.quit();

	}

}
