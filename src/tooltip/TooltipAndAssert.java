package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TooltipAndAssert {
WebDriver driver;
	
	//Assert needs to be used while using test annotation.
	@BeforeMethod
	public void launch()
	{
		driver = new FirefoxDriver();
	}
	@Test
	public void verify()
	{
		driver.get("http://demo.guru99.com/selenium/webform/tooltip.html");
		String expectedToolTip = "What's new in 3.2";
		WebElement downLoadButton = driver.findElement(By.id("download_now"));
		Actions builder = new Actions(driver);
		builder.clickAndHold().moveToElement(downLoadButton).build().perform();
		
		WebElement toolTip = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/a"));
		String actualToolTip = toolTip.getText();
		//System.out.println(actualToolTip);
		
		Assert.assertEquals("What's new in 3.2", actualToolTip );
		
		
		
		
		
		
	    
		
	}

}
