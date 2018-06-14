package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*TestNG again gives us another interesting feature called TestNG Parameters. 
 * TestNG lets you pass parameters directly to your test methods with your testng.xml.
 */
public class WithParameter {
private static WebDriver driver;
@Test
@Parameters({"UserName", "PassWord"})
public void test(String UserName, String PassWord)
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	driver.findElement(By.id("log")).sendKeys(UserName);
	driver.findElement(By.id("pwd")).sendKeys(PassWord);
	driver.findElement(By.id("login")).click();
	driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	driver.quit();
}
}

/*
 * <suite name = "Ecommerce">
 *  <test name = "Regression">
 *   <parameter name = "UserName", value="test_001"/>
 *   <parameter name = "PassWord", value ="test@123/>
 *   <classes>
 *    <class name = "parameterization.WithParameter">
 *   <classes/>
 *  </test>
 * </suite>
 */
