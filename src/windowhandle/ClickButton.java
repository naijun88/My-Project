package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickButton {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	String parentHandle = driver.getWindowHandle();
	System.out.println(parentHandle);
	WebElement clickButton = driver.findElement(By.id("button1"));
	
	for(int i=0; i<3; i++)
	{
		clickButton.click();
		Thread.sleep(3000);
	}
	Set<String> allHandles = driver.getWindowHandles();
	String lastHandleWindow  = "";
	for(String handle : allHandles )
	{
		System.out.println(handle);
		System.out.println("Navigating to google.com");
		driver.switchTo().window(handle);
		driver.get("http://google.com");
		lastHandleWindow = handle;
	}
	driver.switchTo().window(parentHandle);//Switch to the parent window
	driver.close();//close the parent window
	//at this point there is no focused window, we have to explicitly switch back to some window.
	driver.switchTo().window(lastHandleWindow);
	driver.get("http://toolsqa.wpengine.com");

	
}
}
