package windowhandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAlert {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	// Click on the Button "Alert Box"
	driver.findElement(By.name("Alert Box")).click();
	Alert ale = driver.switchTo().alert(); // Switch to JavaScript Alert window
	ale.accept();
	driver.close();
	
}
}
