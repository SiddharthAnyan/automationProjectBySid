package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_withTagnamewithAttributename_value {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement SearchwithId=driver.findElement(By.cssSelector("textarea[id='APjFqb']"));
		SearchwithId.sendKeys("Cricbuzz");
		System.out.println("CSS with tagname with attribute name and value is working fine");
		
		driver.quit();

	}

}
