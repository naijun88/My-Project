package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicXpath {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/v1/");
	
	//basic xpath:
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("Admin123");
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@123");
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//*[contains(@type, 'su')]"));
	driver.findElement(By.xpath("//*[contains(@name,'btn')]"));//find two element with name is btn.
	
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	
	
	driver.findElement(By.xpath("//*[contains(@id, 'message'])"));//find two element id="message23" and "message18"
	
	
	
	driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/']")).click();
	driver.findElement(By.xpath("//*[contains(@href, 'guru99.com')]"));
	driver.findElement(By.xpath("//*[contains(text(), 'here')]"));//!!!no @
	
	//Xpath=//*[@class='barone'] is not working, for this point we need contains method.
	driver.findElement(By.xpath("//img[@src='/logo.png']")).click();
	
	driver.findElement(By.xpath("//*[contains(@class, 'dropdown-toggle')]")).click();
	
	driver.findElement(By.xpath("//*[contains(@href, 'http://demo.guru99.com/insurance/v1/index.php')]")).click();
	driver.findElement(By.xpath("//*[contains(text(), 'Insurance Project')]")).click();
	
	
	driver.findElement(By.xpath("//*[contains(@href, 'demo.guru99.com/payment-gateway')]")).click();
	driver.findElement(By.xpath("//*[contains(text(), 'Payment Gateway Project')]")).click();
	
	
	
	driver.get("https://www.facebook.com/");
	Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
	dropDown.selectByValue("2");
	    
	Select dropDown1 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
    dropDown1.selectByIndex(1);
	    
	Select dropDown2 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
	dropDown2.selectByVisibleText("2010");
	
	String value = driver.findElement(By.xpath("//a[@id='birthday-help']")).getText();
	System.out.println(value);
	
	
	driver.findElement(By.xpath("//button[@id='u_0_w']")).click();
	 
	 
	driver.get("http://toolsqa.com/automation-practice-table/");
	WebElement ele = driver.findElement(By.xpath("//*[@class='wf-container-main']/div/table/tbody/tr[2]/td[1]"));
	String c = ele.getText();
	System.out.println(c);
	
	
	driver.get("http://toolsqa.com/automation-practice-table/");
	WebElement ele2 = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]"));
	String c2 = ele.getText();
	System.out.println(c2);
	driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();

	

	
	
	

	
}
}
