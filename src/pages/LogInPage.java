package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
private static WebElement ele = null;
public static WebElement text_username(WebDriver driver)
{
	ele = driver.findElement(By.id("log"));
	return ele;
}
public static WebElement text_password(WebDriver driver)
{
	ele = driver.findElement(By.id("pwd"));
	return ele;
}

public static WebElement btn_login(WebDriver driver)
{
	ele = driver.findElement(By.id("login"));
	return ele;
}
}
