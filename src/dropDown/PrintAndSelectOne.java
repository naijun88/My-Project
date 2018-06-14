package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAndSelectOne {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();// Create a new instance of the FireFox driver
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Put an Implicit wait
	driver.get("http://toolsqa.wpengine.com/automation-practice-form");
	
	Select dropDown = new Select(driver.findElement(By.id("continents")));
	dropDown.selectByIndex(3);//index start from 0
	dropDown.selectByVisibleText("Europe");
	Thread.sleep(2000);
	
	boolean value = dropDown.isMultiple();
	System.out.println(value);
	
	List<WebElement> item = dropDown.getOptions();
	int count = item.size();
	System.out.println(count);
	
	/*WebElement dropDown1 = driver.findElement(By.id("continents"));
	boolean value1 = dropDown1.isDisplayed();
	System.out.println(value1);
	value1 = dropDown1.isEnabled();
	System.out.println(value1);
	System.out.println(dropDown1.isSelected());*/
	
	// Setting up the loop to print all the options
	for(int i=0; i<count; i++)
	{
		// Storing the value of the option	
		String values = dropDown.getOptions().get(i).getText();
		// or String c = item.get(i).getText()
		System.out.println(values);
		if(values.equals("Africa"))
		{
			dropDown.selectByIndex(i);
			break;
		}
		boolean n = item.get(i).isDisplayed();//dropDown.getOptions().get(i).isDisplayed = WebElement e
		n = item.get(i).isEnabled();
		n = item.get(i).isSelected();

	}
	
	driver.quit();
	
	
	
}
}
