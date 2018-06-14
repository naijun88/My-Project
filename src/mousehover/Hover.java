package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/webform/tooltip.html");
		String expectedTooltip = "What's new in 3.2";
		
		WebElement download = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/a"));
		Actions builder = new Actions(driver);
		builder.clickAndHold().moveToElement(download).build().perform();
		WebElement toolTip = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div"));
        String actualToolTip = toolTip.getText();
        System.out.println(actualToolTip);
        if (actualToolTip.equals(expectedTooltip))
        	System.out.println("Passed");
        else
        	System.out.println("Failed");
		
	}

}
