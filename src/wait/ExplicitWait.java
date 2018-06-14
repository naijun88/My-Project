package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
  @Test
  public void explicitWait() throws InterruptedException
  {
	  WebDriver driver = new FirefoxDriver();
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  
	  driver.get("http://demo.guru99.com/selenium/guru99home/" );
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  
	  if (title.equals("Demo Guru99 Page"))
	  {
		  System.out.println("Passed");
	  }
	  else
	  {
		  System.out.println("Failed");
	  }
	  
	  //we are waiting for an element for the time frame of 20 seconds as defined in the "WebDriverWait" class on the webpage until the
	  //"ExpectedConditions" are met and the condition is "visibilityofElementLocated".
	  WebElement guru99javalink;
	  guru99javalink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/"
	  		+ "div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	  guru99javalink.click();	
	  
  }
}
