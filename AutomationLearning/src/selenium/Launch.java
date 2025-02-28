package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		  driver.findElement(By.linkText("Create new account")).click();
		  Thread.sleep(000);
		  driver.findElement(By.name("firstname")).sendKeys("Vimal");
		  Thread.sleep(1000);
		  driver.findElement(By.name("lastname")).sendKeys("Chaudhary");
		  Thread.sleep(1000);
		  driver.findElement(By.name("reg_email__")).sendKeys("7018805794");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys( "Sid@1997");
		 driver.close();

	}

}
