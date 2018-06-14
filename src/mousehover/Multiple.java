package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.onlinestore.toolsqa.wpengine.com");
	Actions actions = new Actions(driver);
	
	WebElement mainMenu = driver.findElement(By.linkText("menulink"));
	actions.moveToElement(mainMenu);

	WebElement subMenu = driver.findElement(By.cssSelector("subLinklocator"));
	actions.moveToElement(subMenu);
	actions.click().build().perform();
	//Here 'build()' method is used to compile all the list of actions into a 
	//single step and ready to be performed.
	
	
	/*There are cases where you may just want to mouse hover on particular element and 
	check if the button state/color is changing after mouse hover.*/
	WebElement searchBtn = driver.findElement(By.id("searchbtn"));

	Actions action = new Actions(driver);
	action.moveToElement(searchBtn).perform();
}
}
