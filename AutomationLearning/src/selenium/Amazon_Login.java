package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		  driver.get("https://www.amazon.in/"); 
		  driver.manage().window().maximize();
		  
            Thread.sleep(10000);
            WebElement signinOption =driver.findElement(By.id("nav-link-accountList"));
            signinOption.click();
            
            Thread.sleep(5000);
            WebElement mobile = driver.findElement(By.name("email"));
            mobile.sendKeys("7018805794"); 
            
            WebElement mobileContinueBtn = driver.findElement(By.id("continue"));
            mobileContinueBtn.click();
            
            Thread.sleep(5000);
            WebElement password = driver.findElement(By.id("ap_password"));
            password.sendKeys("Sid@123456"); 
            
            WebElement signInBtn = driver.findElement(By.id("signInSubmit"));
            signInBtn.click();
           
            System.out.println("Process Complete: User has been signed in to Amazon.");
           driver.quit();
        }

}
