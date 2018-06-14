
package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMulti {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement text = driver.findElement(By.id("email"));
	Actions builder = new Actions(driver);
	Action seriesOfActions = builder
			.moveToElement(text)
			.click()
			.keyDown(text, Keys.SHIFT)//this will type hello in upper case.		
			.sendKeys(text,"hello")
			.keyUp(text, Keys.SHIFT)
			.doubleClick(text)//this will highlight the text of "HELLO", doesn't work.
			.contextClick(text)//this will bring up the context menu
			.build();
	
	seriesOfActions.perform();
	
	
	
	
}
}
