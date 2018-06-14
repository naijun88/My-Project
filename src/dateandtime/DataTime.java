
package dateandtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataTime 
{
  @Test
  public void datTimePicker() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/selenium");
	  WebElement dataBox = driver.findElement(By.name("bdaytime"));
	  dataBox.sendKeys("09252013");
	  
	  //press tab to shift focus from date to time field.
	  dataBox.sendKeys(Keys.TAB);//Press tab to shift focus to time field
	  dataBox.sendKeys("0255PM");
	  
	  
	
  }
}
