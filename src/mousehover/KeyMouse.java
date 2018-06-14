package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyMouse {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		Actions move = new Actions(driver);
		move.moveToElement(link_Home).build().perform();
		
		
		// Series of multiple action.
		driver.get("http://demo.guru99.com/selenium/newtours/");
		WebElement username = driver.findElement(By.name("userName"));
		Actions move2 = new Actions(driver);
		Action seriesOfAction = move2
				.moveToElement(username)
				.click()
				.keyDown(username, Keys.SHIFT)
				.sendKeys(username, "hello")
				.keyUp(username, Keys.SHIFT)
				.doubleClick(username)
				.contextClick()
				.build();
	    seriesOfAction.perform();
				
				
		
		
		
	 

	}

}
