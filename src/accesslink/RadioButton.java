package accesslink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.wpengine.com/automation-practice-form");
	List<WebElement> radioButton = driver.findElements(By.name("sex"));
	// This statement will return True, in case of first Radio button is selected
	boolean v = radioButton.get(0).isSelected();
	if(v=true)
		radioButton.get(1).click();// This will select Second radio button, if the first radio button is selected by default
	else
		radioButton.get(0).click();//If the first radio button is not selected by default, the first will be selected
	
	WebElement third = driver.findElement(By.id("exp-2"));
	third.click();
	
	List<WebElement> Profession = driver.findElements(By.name("profession"));
	for(int i=0; i<Profession.size(); i++)
	{
		// Store the Check Box name to the string variable, using 'Value' attribute
		String value = Profession.get(i).getAttribute("value");
		//Select the Check Box it the value of the Check Box is same what you are looking for
		if(value.equalsIgnoreCase("Automation Tester"))
			Profession.get(i).click();
		break;
	}
	
	WebElement selenium_ide = driver.findElement(By.cssSelector("#tool-1"));
	selenium_ide.click();
}
			

}
