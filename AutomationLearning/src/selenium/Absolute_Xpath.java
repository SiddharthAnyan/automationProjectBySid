package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[2]"));
		password.sendKeys("secret_sauce");
		
		WebElement Login_btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[3]"));
		Login_btn.click();
		
		driver.quit();
		
		System.out.println("Test Case Passed : User is able to login with valid credentials");
		
		

	}

}
