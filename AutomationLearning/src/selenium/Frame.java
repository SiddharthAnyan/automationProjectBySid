package selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement sample=driver.findElement(By.id("sampleHeading"));
		System.out.println(sample.getText());
		
		driver.quit();
		

	}

}
