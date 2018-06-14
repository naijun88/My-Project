package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
private static WebElement ele = null;
public static WebElement link_MyAccount(WebDriver driver)
{
	ele = driver.findElement(By.id("account"));
	return ele;
}
public static WebElement link_logout(WebDriver driver)
{
	ele = driver.findElement(By.id("account_logout"));
	return ele;
}

}
