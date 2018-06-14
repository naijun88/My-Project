package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class containsSibling {
  @Test
  public void testSiblingAndParentInXpath() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/selenium/guru99home/");
	  List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
	  
	  //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
	  for (WebElement webElement : dateBox)
	  {
		System.out.println(webElement.getText());
	  }
	  
  }
}
