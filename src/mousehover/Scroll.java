package mousehover;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new FirefoxDriver();
	Actions act = new Actions(driver);
	driver.get("https://www.softwaretestingmaterial.com");
	Thread.sleep(3000);
	//SCROLL DOWN
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(3000);
	act.sendKeys(Keys.PAGE_UP).build().perform();
	driver.close();
	
}
}
