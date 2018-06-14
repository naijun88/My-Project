package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Class8 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		Select dropdowncountry = new Select(driver.findElement(By.name("country")));
		
		//dropdowncountry.selectByVisibleText("CHINA");
		dropdowncountry.selectByValue("CHINA");
		//dropdowncountry.selectByIndex()
		
		
		//It only works for multiple list box when you need to remove all selection.
		//dropdowncountry.deselectAll();
		
		
		                                  
		
		if (dropdowncountry.isMultiple())
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
		//or 
		boolean value = dropdowncountry.isMultiple();
	    System.out.println(value);
		

	}

}
