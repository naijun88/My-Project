package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithDataProvider {
/*When you need to pass complex parameters or parameters that need to be created from 
 * Java (complex objects, objects read from a property file or a database, etc…), 
 * in such cases parameters can be passed using Dataproviders. A Data Provider is a method 
 * annotated with @DataProvider. A Data Provider returns an array of objects.
 */
private static WebDriver driver;
@DataProvider(name="Authentication")
public static Object[][] credentials()
{
	return new Object[][]{
		                   {"testuser_1", "Test@123"}, 
		                   {"testuser_2", "Test@126"}
	                     };
}
//Here we are calling the Data Provider object with its Name
@Test(dataProvider = "Authentication")
public void test(String userName, String passWord)
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	driver.findElement(By.id("log")).sendKeys(userName);
	driver.findElement(By.id("pwd")).sendKeys("passWord");
	driver.findElement(By.id("login")).click();
	driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	driver.quit();
}
}
