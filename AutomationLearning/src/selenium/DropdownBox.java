package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBox {

	public static void main(String[] args) {
	
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		
		List<WebElement> options = s.getOptions();   //use to return all options
		System.out.println("Total options in dropdownbox : "+options.size());   //to check total options
		
		for(WebElement option :options) 
		{
			System.out.println("Option are : " + option.getText());
		}
		
		s.selectByIndex(1);                                          //Select dropdown by using selectByIndex()
		s.selectByValue("search-alias=nowstore");  //Select dropdown by using selectByValue()
		s.selectByVisibleText("Appliances");             //Select dropdown by using selectByVisibleText()
		 System.out.println("Current Selected option: " + s.getFirstSelectedOption().getText());  //use getFirstSelectedOption to get current option
		driver.quit();
	
	}

}
