package filehandle;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureFailedEventListner {
private static WebDriver driver;
@Test
public static void capture()
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.softwaretestingmaterial.com");
	String e = "werty";
	String a = driver.getTitle();
	Assert.assertEquals(a, e);
}
@AfterMethod
public void screenshot() throws Exception
{
	EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
	File scrFile = edriver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("/Users/shimeiblanco/Desktop/test.png"));		
}


}
