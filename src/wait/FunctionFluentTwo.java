package wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FunctionFluentTwo {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.pollingEvery(250, TimeUnit.MILLISECONDS);
	wait.withTimeout(2, TimeUnit.SECONDS);
	wait.ignoring(NoSuchElementException.class);
	Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>()
			{ 
		       public WebElement apply(WebDriver arg0)
		       {
		    	   System.out.println("Checking for the element!!");
		    	   WebElement element = arg0.findElement(By.id("target"));
		    	   if(element != null)
					{
						System.out.println("Target element found");
					}
					return element;
		       }
		
			};
	wait.until(function);
	
}
}
