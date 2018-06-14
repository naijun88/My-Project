package draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PassThreePara {

public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(5000); 	
	WebElement From = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
	Actions act = new Actions(driver);
	
			
	
	//Drag and Drop by Pixel(x, y)
	act.dragAndDropBy(From, 148, 41).build().perform();
}

}
