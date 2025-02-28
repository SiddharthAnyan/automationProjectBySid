package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTA_page {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Downloads/GTAhtmlAutomation.html");
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	WebElement username = driver.findElement(By.xpath("//input[@id='1']"));  // Relative XPath
	WebElement hint = driver.findElement(By.xpath("/html/body/input[2]"));   //Absolute XPath
	WebElement Password = driver.findElement(By.xpath("//input[@name='password' and @id='3']"));  //Relative XPath with AND
	WebElement firstname = driver.findElement(By.xpath("//*[@name='fname']"));  // Relative XPath
	WebElement lastname = driver.findElement(By.xpath("/html/body/form/input"));  //Absolute XPath
	WebElement submit = driver.findElement(By.xpath("/html/body/form/input[3]")); // Absolute XPath
	
	username.sendKeys("Siddharth");
	hint.sendKeys("You are doing great");
	Password.sendKeys("Sid@1234");
	firstname.sendKeys("Sid");
	lastname.sendKeys("Anyan");
	submit.sendKeys(Keys.ENTER);
	
   driver.quit();
	System.out.println("Test Case Passed : User Registered Successfully!!!!!!!!!! ");
	}

}
