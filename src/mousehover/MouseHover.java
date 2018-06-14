package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;




/*use the moveToElement() method to mouse-over on one Mercury Tours' table rows
 The cell shown above is a portion of a <TR> element. If not hovered, its color is 
 #FFC455 (orange). After hovering, the cell's color becomes transparent.
It becomes the same color as the blue background of the whole orange table.
 */
public class MouseHover {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/selenium/newtours/");
	WebElement linkHome = driver.findElement(By.linkText("Home"));
	WebElement td_Home = driver.findElement(By.xpath("/html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));
	Actions builder = new Actions(driver);
	
	       // mouseOverHome = builder.clickAndHold();
	       // mouseOverHome = builder.contextClick();
	       // mouseOverHome = builder.doubleClick();
	       // mouseOVerHome = builder.dragAndDrop(source, target);
	       // mouseOverHome = builder.keyDown(keys.SHIFT);
	       // mouseOverHome = builder.keyUp();
	String bgColorBefore = td_Home.getCssValue("background-color");//background-color
	System.out.println("Before hover: " + bgColorBefore); 
	builder.moveToElement(linkHome).build().perform();
	String bgColorAfter = td_Home.getCssValue("background-color");
	System.out.println("After hover: " + bgColorAfter);
	driver.close();
	
	
	        
	
	
}
}
