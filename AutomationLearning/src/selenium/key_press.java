package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class key_press {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]"));
		
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		
		username.sendKeys(Keys.CONTROL + "a");
		username.sendKeys(Keys.BACK_SPACE);   //Use Backspace key
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[2]"));
		password.sendKeys("secret_sauce");
		
		WebElement Login_btn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[3]"));
		Login_btn.sendKeys(Keys.ENTER);    //USe Enter Key 
		
	   driver.quit();
		
		System.out.println("Test Case Passed : User is able to login with valid credentials");

	}

}
