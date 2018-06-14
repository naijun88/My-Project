package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class alertDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
	
		Alert alert1 = driver.switchTo().alert();
		
		String alertMes = driver.switchTo().alert().getText();
		System.out.println(alertMes);
		Thread.sleep(5000);
		alert1.dismiss();
		
		Thread.sleep(5000);
		driver.findElement(By.name("cusid")).clear();
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(5000);
		alert2.accept();
		driver.close();

	}

}
