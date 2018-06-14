package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class printAndSelectMultiple {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.wpengine.com/automation-practice-form");
	
	Select dropDown = new Select(driver.findElement(By.id("selenium_commands")));
	dropDown.selectByIndex(0);
	Thread.sleep(2000);
	dropDown.deselectByIndex(0);
	boolean s = dropDown.isMultiple();
	System.out.println(s);

	List<WebElement> item = dropDown.getOptions();
	int count = item.size();
	System.out.println(count);
	
	for(int i=0; i<count; i++)
	{
		String values = dropDown.getOptions().get(i).getText();
		//or
		//String value1 = item.get(i).getText();
		System.out.println(values);
		dropDown.selectByIndex(i);//select all options in the options list
		
	}
	dropDown.deselectAll();
	driver.close();

}
}
