package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class4 {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.xpath("html/body/input")).click();
		String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();//Click ok button on the alert screen.
		System.out.println(alert);
		driver.close();

	}

}
