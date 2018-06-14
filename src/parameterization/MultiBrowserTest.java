package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {
public static WebDriver driver;
@Parameters("browser")
@BeforeClass
//Passing Browser parameter from TestNG xml
public void beforeTest(String browser)
{
	 // If the browser is Firefox, then do this
	if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	// If browser is IE, then do this	  
	else if(browser.equalsIgnoreCase("ie"))
	{
		// Here I am setting up the path for my IEDriver
		System.setProperty("webdriver.ie.driver", "/Users/shimeiblanco/Desktop/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	// Doesn't matter the browser type, lauch the Website
	driver.get("http://www.store.demoqa.com");
}

//Once Before method is completed, Test method will start
@Test
public void login()
{
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	driver.findElement(By.id("log")).sendKeys("testuser_1");
	driver.findElement(By.id("pwd")).sendKeys("Test@123");
	driver.findElement(By.id("login")).click();
}
@AfterClass
public void afterTest()
{
	driver.quit();
}
}
/*<suite name = "Ecommerce>
 *  <test name = "FirefoxTest">
 *   <parameter name = "browser", value="firefox"/>
 *   <classes>
 *    <class name = parameterization.MultiBrowserTest>
 *   <classess/>
 *  </test>
 *  <test name = "IETest">
 *   <parameter name = "browser", "value="ie"/>
 *   <classes>
 *    <class name = parameterization.MultiBrowserTest>
 *   </classes>
 *  </test>
 * </suite>
 *   
 * 
 */
