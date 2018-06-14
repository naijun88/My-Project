package test1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsOne 
{
	public void adminLogin(String username, String password)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}
	
	
	public static void main(String[] args) 
	{
		MethodsOne object = new MethodsOne();
		object.adminLogin("admin", "admin@123");

	}

}
