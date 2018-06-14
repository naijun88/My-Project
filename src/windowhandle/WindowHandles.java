package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {
//Handle multiple browsers
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("Some link can open new window");
	driver.findElement(By.id("ij")).click();//second page displayed
	String parent = driver.getWindowHandle();
	Set<String> Handles = driver.getWindowHandles();
	int browser_count = Handles.size();
	System.out.println(browser_count);
	for(String s : Handles)
	{
		if(!s.equals(parent))
		{
			driver.switchTo().window(s);
			System.out.println(driver.getCurrentUrl());
		}
	}
	driver.switchTo().window(parent);
	System.out.println(driver.getCurrentUrl());//get the first link
	
}
}
