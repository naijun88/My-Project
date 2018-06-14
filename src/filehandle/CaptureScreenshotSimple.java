package filehandle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshotSimple {
public static void main(String[] args) throws Exception
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("/Users/shimeiblanco/Desktop/test.png"));
}
}
