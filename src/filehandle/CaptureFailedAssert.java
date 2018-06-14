package filehandle;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureFailedAssert {
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
public void screenshot(ITestResult result) throws Exception
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("/Users/shimeiblanco/Desktop/test.png"));
	}
}
}
