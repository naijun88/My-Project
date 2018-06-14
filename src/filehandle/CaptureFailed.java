package filehandle;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureFailed {
private static WebDriver driver;
@Test
public static void capture()
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.softwaretestingmaterial.com");
	driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); 
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
