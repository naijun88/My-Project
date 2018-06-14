package draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PassTwoPara {
WebDriver driver;
@Test
public void DragAnd() throws InterruptedException
{
	
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);

	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	//Element which needs to drag.   
	WebElement From = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
	
	//Element on which need to drop.	
	WebElement To = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/h3"));
	 //Using Action class for drag and drop.
	Actions act = new Actions(driver);
	//Drag and drop
	act.dragAndDrop(From, To).build().perform();//call method dradAndDrop

}
}
