package test1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// Cross Browsers Testing.
		// 1. FireFox Browser
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Google"))
		{
			System.out.println("Google Application Launched - Passsed");
		}
		else
		{
			System.out.println("Google Application Not Launched - Failed");
		}
		driver.close();*/
		
		
		// 2. Google Chrome Testing.
		/*System.setProperty("webdriver.chrome.driver", "/Users/shimeiblanco/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Google"))
		{
			System.out.println("Google Application Launched - Passsed");
		}
		else
		{
			System.out.println("Google Application Not Launched - Failed");
		}
		driver.close();	*/
		
		
		// 3. Internet Explorer Browser.
		/*System.setProperty("webdriver.ie.driver", "/Users/shimeiblanco/Downloads/IEDriverServer");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		if (pageTitle.equals("Google"))
		{
			System.out.println("Google Application Launched - Passsed");
		}
		else
		{
			System.out.println("Google Application Not Launched - Failed");
		}
		driver.close();
		*/
		
		
		// Execute Firefox, Chrome together continuously.
		
		
		

	}

}
