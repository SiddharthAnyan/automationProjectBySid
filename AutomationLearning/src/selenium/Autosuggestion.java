package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> option = driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']//li"));
		option.size();
		System.out.println("Size of the autosuggestion:"+option.size());

		for(int i=0; i<option.size();i++) 
		{
			System.out.println("Autosuggestion options are :"+option.get(i).getText());	
		}
		if(option.size()>2) 
		{
			String selectedOption = option.get(2).getText();
			option.get(2).click();
			System.out.println("!!!--------------------------------------------!!!");
			System.out.println("Selected Autosuggestion: " + selectedOption);
			System.out.println("Index 2 clicked");
			
		}else 
		{
			System.out.println("Less than 3 option available that'why given index  cannot click");
		}
		Thread.sleep(3000);
		driver.quit();
	}
	
}
