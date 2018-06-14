package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jdk.internal.org.objectweb.asm.commons.Method;



public class ParameterByMethodInDataprovider {
private WebDriver driver;
@Test(dataProvider = "Authentication")
public void test(String sUsername, String sPassword)
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
    driver.findElement(By.id("log")).sendKeys(sUsername);

    driver.findElement(By.id("pwd")).sendKeys(sPassword);

    driver.findElement(By.id("login")).click();

    driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

    driver.quit();
	
}
/*Method- If the SAME DataProvider should behave differently with different test method , use Method 
parameter.*/
//@DataProvider(name = "Authentication")
public Object[][] getDataFromDataprovider(Method m)
{
	if(m.getName().equalsIgnoreCase("testMethodA"))
	{
		return new Object[][]
		{
			{"testuser_1", "Test@123"}, 
			{"testuser_1", "Test@123"}
		};	
	}
	else
	{
		return new Object[][]
				{
					{"testuser_8", "Test@1234"}, 
					{"testuser_9", "Test@1253"}
				};	
		
			
		
				
			
			
				
	}
}
}
