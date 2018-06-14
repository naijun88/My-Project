package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ancestor 
{
  @Test
  public void testAncesotrInXpath() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/selenium/guru99home/");
	  
	  //Search All elements in 'Popular course' section 
	  //with the help of ancestor of the anchor whose text is 'SELENIUM'
	  List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
	  
	  //Print all the which are sibling of the element named as 'SELENIUM' in 'Popular course'
	  for (WebElement webElement : dateBox)
	  {
		  System.out.println(webElement.getText());
	  }
  }
}
