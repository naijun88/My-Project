package test1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 
{
	 public static WebDriver driver;
	  @BeforeClass
	  public void launchBrowser()
	  {
		  driver = new FirefoxDriver();	
	  }
	  @Test (priority = 1)
	  public void verifygoogleTitle()
	  {
		  driver.get("https://www.google.com/");
		  String pageTitle = driver.getTitle();
		  if (pageTitle.equals("Google"))
		  {
			  System.out.println("Passed");
		  }
	  }
	  @Test (priority = 2)
	  public void verifyyahooTitle()
	  {
		  driver.get("https://www.yahoo.com/");
		  String pageTitle = driver.getTitle();
		  if (pageTitle.equals("Yahoo"))
		  {
			  System.out.println("Passed");
		  }
	  }
	  @Test (priority = 3)
	  public void verifybankofindiaTitle()
	  {
		  driver.get("http://www.bankofindia.co.in/english/home.aspx");
		  String pageTitle = driver.getTitle();
		  if (pageTitle.equals("Google"))
		  {
			  System.out.println("Passed");
		  }
	  }
	  @AfterClass
	  public void closeBrowser()
	  {
		  driver.close();
	  }
	 
}
