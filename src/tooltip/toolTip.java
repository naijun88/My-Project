package tooltip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class toolTip 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" http://demo.guru99.com/selenium/webform/social-icon.html");
		
		String t = driver.findElement(By.className("github")).getAttribute("title");
		String expectedTitle = "Github";
		
		if (t.equals(expectedTitle))
			System.out.println("The expected title is the same like " + t + " Passed");
		else
			System.out.println("The expected title is Not the same like " + t + " Failed");

	}

}
