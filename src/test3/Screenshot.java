package test3;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {
@Test
public void testScreenShot() throws Exception
{
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/V4/");
	//call take screenshot function.
	this.takeSnapShot(driver, "Users/shimeiblanco/educ/test.png");	// ???
}

public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception
{
	TakesScreenshot scrShot = ((TakesScreenshot)webdriver);//Convert web driver object to TakeScreenshot
	//Call getScreenshotAs method to create image file
	File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
	//move image file to new destination 
	File DestFile = new File(fileWithPath);
	//Copy file at destination
	FileUtils.copyFile(scrFile, DestFile);
	
}

}
