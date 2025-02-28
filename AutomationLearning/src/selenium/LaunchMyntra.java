package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMyntra {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		String myntraTitle= driver.getTitle();
		System.out.println("Title of the page is :"+myntraTitle);
		Thread.sleep(10000);
		driver.close();
		
	}

}
