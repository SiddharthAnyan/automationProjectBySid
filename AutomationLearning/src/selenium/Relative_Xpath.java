package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Relative_Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("student");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("Password123");
		
		WebElement submit_btn = driver.findElement(By.xpath("//button[@id='submit']"));
		submit_btn.click();
		
		driver.quit();
		
		System.out.println("Test Case Passed : User Is able to login");
		
	}

}
