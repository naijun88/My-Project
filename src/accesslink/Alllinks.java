
package accesslink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alllinks {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/selenium/newtours/");
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	List <WebElement> linkElements = driver.findElements(By.tagName("a"));
	for(int i=0; i<linkElements.size(); i++)
	{
		String s = linkElements.get(i).getText();
		System.out.println(s);
	}
	
	
	for(int i=0; i<linkElements.size(); i++)
	{
		linkElements.get(i).click();
		if(driver.getTitle().equals(pageTitle))
			System.out.println(i+" is working");
		else
			System.out.println(i+" is not working");
	
	}
	driver.navigate().back();
	driver.quit();
		
		
	
	
}
}
