package wait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;



public class fluentWait 
{
  @Test
  public void testFluentWaitInXpath() throws InterruptedException
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://demo.guru99.com/selenium/guru99home/" );
	  driver.manage().window().maximize() ;
	  String title = driver.getTitle();
	  
	  if (title.equals("Demo Guru99 Page"))
	  {
		  System.out.println("Passed");
	  }
	  else
	  {
		  System.out.println("Failed");
	  }
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)//FluentWait wait = new FluentWait(driver);
			  .withTimeout(30, TimeUnit.SECONDS)
			  .pollingEvery(5, TimeUnit.SECONDS)
			  .ignoring(NoSuchElementException.class);
	  WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>()
	  {
		  public WebElement apply(WebDriver driver )
		  {
			  return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/" + "div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
		  }
	  });
	 //click on the Selenium link
	 clickseleniumlink.click();
	 driver.close();
			  
  }
}
