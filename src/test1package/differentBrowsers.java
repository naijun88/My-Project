package test1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class differentBrowsers {

	public static void main(String[] args) 
	{
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.google.com/");
		firefoxDriver.findElement(By.linkText("Sign in")).click();
		String s = firefoxDriver.findElement(By.xpath(".//*[@id='headingSubtext']")).getText();
		System.out.println(s);
		
		System.setProperty("webdriver.chrome.driver", "/Users/shimeiblanco/Downloads/chromedriver");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://www.gcrit.com/build3/create_account.php?osCsid=ijgan4eiqspdgesb8vsnh7stq6");
		chromeDriver.findElement(By.name("firstname")).sendKeys("junjun");	
		
		
		/*System.setProperty("webdriver.ie.driver", "/Users/shimeiblanco/Downloads/IEDriverServer.exe");
		WebDriver IEDriver = new InternetExplorerDriver();
		IEDriver.get("https://www.yahoo.com/");
		IEDriver.findElement(By.id("uh-search-box")).isDisplayed();*/
		
		firefoxDriver.close();
		chromeDriver.close();
		//IEDriver.close();
		
		
		
	}
}
