package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchAmazon {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("Title of the page is : "+driver.getTitle());
		driver.close();
		

	}

}
