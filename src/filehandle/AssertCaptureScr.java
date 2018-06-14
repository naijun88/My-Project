
package filehandle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

public class AssertCaptureScr {
public static WebDriver driver;
@Test
public void verify()
{
	driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/");	
	Assert.assertEquals(true, driver.findElement(By.xpath("loginn")).isDisplayed());
}

@AfterMethod//can not be @Test(priority=1) because must be different execution level.
public void takeScrFailure(ITestResult testResult) throws Exception
{
	if(testResult.getStatus()==ITestResult.FAILURE)
	{
		System.out.println(testResult.getStatus());
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("/Users/shimeiblanco/Desktop/test.png"));
	}
	
}
}
