package accesslink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindAllLinks {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i = 0; i < links.size(); i++)
		System.out.println(links.get(i).getText());
	
	
	
	
	List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkBoxes.size());
	
	List<WebElement> dropDown = driver.findElements(By.tagName("select"));
	System.out.println(dropDown.size());
	
	Select drop = new Select(driver.findElement(By.id("selenium_commands")));
	List<WebElement> list = drop.getOptions();
	int count = list.size();
	System.out.println(count);
	
	List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
	System.out.println(textBoxes.size());
}

    
}
