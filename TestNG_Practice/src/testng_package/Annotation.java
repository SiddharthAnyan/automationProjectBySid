package testng_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotation
{
	@Test
	public void tc1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
	}

}