package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	WebElement target=driver.findElement(By.id("droparea"));
	
	WebElement source1=driver.findElement(By.id("node"));
	WebElement source2=driver.findElement(By.id("mongo"));
	WebElement source3=driver.findElement(By.id("angular"));
	
	Actions act = new Actions(driver);
	
	act.clickAndHold(source1).moveToElement(target).release().perform();
	act.dragAndDrop(source2, target).perform();
	act.dragAndDrop(source3, target).perform();

	
	System.out.println("All these source image has been dragged to the target area");
	driver.quit();

	}

}
