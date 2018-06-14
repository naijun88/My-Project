package test1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VerifyTitle 
{
	@Test
	public void verifyTitle()
	{
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");

		Assert.assertEquals("Google",driver.getTitle());
		driver.close();
	}

}
