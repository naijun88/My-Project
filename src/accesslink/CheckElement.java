package accesslink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckElement {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("as");
		WebElement ele = driver.findElement(By.id("id"));
		if(ele instanceof WebElement)
		{
			System.out.println("Element visible");	
		}
		else
		{
			System.out.println("Element not visible");
		}
	}
}
