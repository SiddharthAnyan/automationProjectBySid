package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String FlipkartTitle=driver.getTitle();
		System.out.println("Title of the page is : "+FlipkartTitle);
		driver.close();
	
	}

}
