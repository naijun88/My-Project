package filehandle;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot {
@Test
public void takeScreenShot() throws Exception
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/V4/");
	//Call take screenshot function
	this.takeSnapShott(driver, "/Users/shimeiblanco/Desktop/test.png");
	
}
/**

 * This function will take screenshot


 * @param webdriver

 * @param fileWithPath

 * @throws Exception

 */
public static void takeSnapShott(WebDriver webdriver, String fileWithPath) throws Exception
{
	//Convert web driver object to TakeScreenshot
	 TakesScreenshot scrShot =((TakesScreenshot)webdriver);


	//Call getScreenshotAs method to create image file
	 File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
	 // or File ScrFile = ((TakesScreenshot)webdriver);
	//Move image file to new destination
	 File DestFile=new File(fileWithPath);
	//Copy file at destination
	 FileUtils.copyFile(ScrFile, DestFile);

}
}
