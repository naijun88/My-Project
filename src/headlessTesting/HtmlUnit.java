package headlessTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
/* it does not have GUI so one cannot see the test execution on screen.
   No browser launched while executing.
   It is platform independent and easier to run several tests concurrently. 
   Ideal for Load Testing.
 */
public class HtmlUnit {
public static void main(String[] args)
{
	// Declaring and initialising the HtmlUnitWebDriver
	HtmlUnitDriver unitDriver = new HtmlUnitDriver();
	//or WebDriver driver = new HtmlUnitDriver();
	unitDriver.get("http://google.com");
	System.out.println("The page title is " + unitDriver.getTitle());
	
	WebElement searchBox = unitDriver.findElement(By.name("q"));
	searchBox.sendKeys("Selenium");
	WebElement button = unitDriver.findElement(By.name("gbqfba"));
	button.click();
	System.out.println("The page title is " + unitDriver.getTitle());
}
}
