package test1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowserTesting {
	public static WebDriver driver;
	public static int browser;
	public static String BrowserName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (browser = 1; browser <= 2; browser++)
		{
			if (browser == 1)
				
			{
				driver = new FirefoxDriver();	
				BrowserName = "Mozilla Firefox Browser: ";
			}
			else if (browser == 2)
			{
				System.setProperty("webdriver.chrome.driver", "/Users/shimeiblanco/Downloads/chromedriver");
				driver = new ChromeDriver();
				BrowserName = "Google Chrome Browser: ";
			}
			driver.get("https://www.google.com/");
			String pageTitle = driver.getTitle();
			if (pageTitle.equals("Google"))
			{
				System.out.println(BrowserName + " - Google Application Launched - Passsed");
			}
			else
			{
				System.out.println(BrowserName + " - Google Application Not Launched - Failed");
			}
		driver.close();
				
				
		}
		
		

	}

}
