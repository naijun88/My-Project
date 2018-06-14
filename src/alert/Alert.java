package alert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		String s = driver.getWindowHandle();
		System.out.println(s);
		driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]")).click();
		String mainWindow = driver.getWindowHandle();
		//To handle all opened windows
		Set <String> str = driver.getWindowHandles();
		Iterator <String> i = str.iterator();
		
		while(i.hasNext())
		{
			String ChildWindow = i.next();
			if(!mainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.findElement(By.xpath("//input[@name='emailid']")).getText());
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.id("btnLogin")).click();
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		
		
		
	}
}
