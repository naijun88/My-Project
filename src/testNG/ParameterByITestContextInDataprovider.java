package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ParameterByITestContextInDataprovider {
private WebDriver driver;
@Test(dataProvider = "Authentication", groups="A")
public void testMethodA(String sUsername, String sPassword)
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
@Test(dataProvider = "Authentication", groups="B")
public void testMethodB(String sPassword)
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();

    driver.findElement(By.id("pwd")).sendKeys(sPassword);

    driver.findElement(By.id("login")).click();

    driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

    driver.quit();
}
//@DataProvider(name="SearchProvider")
public Object[][] getDataFromDataprovider(ITestContext c)
{
	Object[][] groupArray = null;
	for (String group : c.getIncludedGroups())
	{
		if(group.equalsIgnoreCase("A"))
		{
			groupArray = new Object[][]{
				{"testuser_1", "Test@123"}, 
				{"testuser_1", "Test@123"}
			};
		break;
		}
		else if(group.equalsIgnoreCase("B"))
		{
			groupArray = new Object[][] { 
				{"testuser_8", "Test@1234"}, 
				{"testuser_9", "Test@1235"}
				
		};
		
	}
	break;
	
					
			
					
				
					
		}
	return groupArray;
	
	}
}
	
