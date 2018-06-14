package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementFrame {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
	//find the numbers of frame way 1: 
	int count = driver.findElements(By.tagName("iframe")).size();
	System.out.println(count);
	
	////find the numbers of frame way 2:
	List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
	System.out.println(iframe.size());
	
	//Switch by Index
	driver.switchTo().frame(0);
	
	//Switch by frame name
	driver.switchTo().frame("frame1");
	
	//Switch by frame ID
	driver.switchTo().frame("IF1");
	
	//Switch to Frame by WebElement
	WebElement frameElement = driver.findElement(By.id("IF1"));
    driver.switchTo().frame(frameElement);
    
    //Switching back to Main page from Frame
    //now use the switch command
    //Do all the required tasks in the frame 0
    driver.switchTo().frame(0);
    
    driver.switchTo().defaultContent();
    driver.quit();
	
}
}
