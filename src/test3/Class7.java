package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/shimeiblanco/Downloads/chromedriver");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://demo.guru99.com/selenium/webform/login.html");
		
		WebElement email = chromeDriver.findElement(By.id("email"));
		WebElement password = chromeDriver.findElement(By.id("passwd"));
		WebElement login = chromeDriver.findElement(By.id("SubmitLogin"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		System.out.println("It is ready to login");
		
		email.clear();
		password.clear();
		System.out.println("It is not ready to login");
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		System.out.println("It is ready to login again");
		login.click();
		System.out.println("Login successfully");
		chromeDriver.close();
		
		
				

	}

}
