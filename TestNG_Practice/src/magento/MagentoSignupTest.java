package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class MagentoSignupTest {
	
	WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void positiveSignupTest() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.findElement(By.id("firstname")).sendKeys("John");
        driver.findElement(By.id("lastname")).sendKeys("Doe");
        driver.findElement(By.id("email_address")).sendKeys("test" + System.currentTimeMillis() + "@example.com");
        driver.findElement(By.id("password")).sendKeys("Test@1234");
        driver.findElement(By.id("password-confirmation")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".message-success")).isDisplayed(), "Signup Failed");
    }

    @Test
    public void negativeSignupTest() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
        Assert.assertTrue(driver.findElement(By.id("firstname-error")).isDisplayed(), "First Name Error Not Shown");
        Assert.assertTrue(driver.findElement(By.id("lastname-error")).isDisplayed(), "Last Name Error Not Shown");
        Assert.assertTrue(driver.findElement(By.id("email_address-error")).isDisplayed(), "Email Error Not Shown");
        Assert.assertTrue(driver.findElement(By.id("password-error")).isDisplayed(), "Password Error Not Shown");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
