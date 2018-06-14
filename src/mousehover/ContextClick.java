package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement clickable = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	Actions act = new Actions(driver);
	act.moveToElement(clickable).contextClick().build().perform();
	System.out.println(driver.findElement(By.xpath("/html/body/ul")).getText());	
	//act.moveToElement(clickable).moveToElement(driver.findElement(By.xpath("/html/body/ul")).click().build().perform();
		
}
}
