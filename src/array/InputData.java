package array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputData {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.yahoo.com/");
	String[] testData = {"test1", "test2", "test3"};
	WebElement textBox = driver.findElement(By.id("uh-search-box"));
		
	int n = testData.length;
	for(int i=0; i<n; i++)
	{
		textBox.sendKeys(testData[i]);
		textBox.clear();
	}
}
}
