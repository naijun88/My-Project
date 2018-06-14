package pomTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;
import pages.LogInPage;

public class TestCase001 {
private static WebDriver driver;
public static void main(String[] args)
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	// Use page Object library now
	HomePage.link_MyAccount(driver).click();
	LogInPage.text_username(driver).sendKeys("testuser_1");
	LogInPage.text_password(driver).sendKeys("Test@123");
	LogInPage.btn_login(driver).click();
	System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	HomePage.link_logout(driver).click();
	driver.quit();
}
}
