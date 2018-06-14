package windowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindow {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/au"
				+ "tomation-practice-switch-windows/");
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/p[3]/button")).click();
		Set handles = driver.getWindowHandles();
		System.out.println(handles);
		for(String handle1 : driver.getWindowHandles())
		{
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		driver.close();
		driver.quit();

	}	
}
