package test1package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;




public class firstStep {

	public static void main(String[] args)
	{
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/index.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Successfull - passed");
			
		}
		else
		{
			System.out.println("Faield");
			
		}*/
		
		
		
		//Synchronization.
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//Unconditional Synchronization.
		//Thread.sleep(10000);
		//driver.findElement(By.linkText("Gmail")).click();
		
		//Conditional Synchronization.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail")).click();
		

	}

}
