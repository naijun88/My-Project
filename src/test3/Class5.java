package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class5 {

	public static void main(String[] args)
    {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin@123");
		username.clear();
		
		WebElement login = driver.findElement(By.id("tdb1"));
		//login.click();
		login.submit();
		

	}

}
