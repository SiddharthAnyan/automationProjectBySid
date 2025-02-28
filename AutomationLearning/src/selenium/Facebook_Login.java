package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.name("pass"));
		WebElement logIn_btn= driver.findElement(By.name("login"));
		
		email.sendKeys("siddharthanyan@gmail.com");
		password.sendKeys("Sid@1234");
		logIn_btn.click();
		System.out.println("Login Successful");

	}

}
