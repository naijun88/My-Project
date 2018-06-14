package test1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnMethods 
{
	public static WebDriver driver;
	  @Test
	  public void launchBrowser()
	  {
		  driver = new FirefoxDriver();	
	  }
	  @Test (dependsOnMethods = "verifyyahooTitle", alwaysRun = true)
	  public void verifygoogleTitle()
	  {
		  driver.get("https://www.google.com/");
		  String pageTitle = driver.getTitle();
		  Assert.assertEquals("Google", pageTitle);
	  }
	  @Test (dependsOnMethods = "launchBrowser")
	  public void verifyyahooTitle()
	  {
		  driver.get("https://www.yahoo.com/");
		  String pageTitle = driver.getTitle();
		  Assert.assertEquals("Yahooo", pageTitle);
	  }
	  @Test (dependsOnMethods = "verifygoogleTitle")
	  public void closeBrowser()
	  {
		  driver.close();
	  }
	

}

