package accesslink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/radio.html");
	/*List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int count = checkBox.size();
	for(int i=0; i<count; i++)
	{
		checkBox.get(i).click();
	}*/
	
	List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
	int count1 = radioButton.size();
	for(int j=0;j<count1; j++)
		radioButton.get(j).click();
		
}
}
