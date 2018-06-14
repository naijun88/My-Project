package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Basic {
public static WebDriver driver;
public static void main(String[] args)
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.onlinestore.toolsqa.wpengine.com");
	WebElement element = driver.findElement(By.linkText("Product Category"));
	Actions act = new Actions(driver);
	act.moveToElement(element).build().perform();
	driver.findElement(By.linkText("iPads")).click();
	//or Action mouseHoverProductCat = act.moveToElement(element).build().perform();
	
	
	//it can be done in other way
	Actions act2 = new Actions(driver);
	act.moveToElement(element).moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
	
	/*With some of the browser it happens that once mouse hover action is performed, the menu list 
	disappear with in the fractions of seconds before Selenium identify the next submenu item 
	and perform click action on it. In that case it is better to use ‘perform()’ action on the 
	main menu to hold the menu list till the time Selenium identify the sub menu item and click on it.*/
	
	
	Actions act3 = new Actions(driver);
	//To focus on element 
	act3.moveToElement(element).perform();
	WebElement subElement = driver.findElement(By.linkText("iPads"));
	//perform() method is used here to execute the action.
	//click() method is used here to click the element.
	act3.moveToElement(subElement).click().perform();
	
	//multiple keys
	String press = Keys.chord(Keys.SHIFT, Keys.ENTER);
	subElement.sendKeys(press);
	driver.findElement(By.id("id")).sendKeys(Keys.ENTER);
	
}
}
