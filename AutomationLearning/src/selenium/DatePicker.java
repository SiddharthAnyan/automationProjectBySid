package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) 
	{
	
		String expectedDate = "12";
		String expectedMonth = "August";
		String expectedYear = "1997";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement dob=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));  // click on the dob calender
		if(dob.isDisplayed()) 
		{
			dob.click();
		}else 
		{
			System.out.println("Element not visible");
		}
		
		//month
		  WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
		  //click month
		  
		  if(month.isDisplayed()) { month.click(); }else {
		  System.out.println("Month element not visible"); }
		  
		  Select selectmonth = new Select(month);
		  selectmonth.selectByVisibleText(expectedMonth);
		  System.out.println("Month selected");
		 
		//year
		WebElement year=driver.findElement(By.className("react-datepicker__year-select"));  // click year
		if(year.isDisplayed()) 
		{
			year.click();
		}else 
		{
			System.out.println("year element not visible");
		}
		
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText(expectedYear);	
		System.out.println("Year Selected");
		//click outside
		//WebElement calendar = driver.findElement(By.className("react-datepicker"));
        //calendar.click(); 
        
		//date
		List<WebElement> dayList=driver.findElements(By.xpath("//div[starts-with(@class,'react-datepicker__day')]")); //click date
		
		for(WebElement day : dayList) 
		{
			String calenderDate=day.getText();
			
			if(calenderDate.equals(expectedDate)) 
			{
				day.click();
				System.out.println("Date selected and clicked");
				break;
			}
			else 
			{
				System.out.println("Date not selected");
			}
		}
		
		System.out.println(dob.getDomAttribute("value"));
		
	}

}
