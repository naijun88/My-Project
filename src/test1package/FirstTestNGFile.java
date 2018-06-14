package test1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile 
{
  public static WebDriver driver;
  @Test (priority = 1)
  public void launchBrowser()
  {
	  driver = new FirefoxDriver();	
  }
  @Test (priority = 2)
  public void verifygoogleTitle()
  {
	  driver.get("https://www.google.com/");
	  String pageTitle = driver.getTitle();
	  Assert.assertEquals("Google", pageTitle);
  }
  @Test (priority = 3)
  public void verifyyahooTitle()
  {
	  driver.get("https://www.yahoo.com/");
	  String pageTitle = driver.getTitle();
	  Assert.assertEquals("Yahoo", pageTitle);
  }
  @Test (priority = 4)
  public void closeBrowser()
  {
	  driver.close();
  }
}
