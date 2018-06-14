package test1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class grFirst {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); // launches firefox browser with
		driver.get("http://www.gcrit.com/build3/admin/index.php");
		
		WebElement element = driver.findElement(By.name("username"));
		
		element.sendKeys("hola");
		
		System.out.println("hola" + element);
		
//		driver.close();
//		driver.quit();
		
//												// blank URL
//		driver.get("http://www.gcrit.com/build3/admin/index.php");
//		WebElement element = driver.findElement(By.name("username"));
//		
//		if (element == null) { 
//			System.out.print("Error, the element in the page was not found");
//		} else {
//			element.sendKeys("admin");
//		}
//				
//		
//		
//		driver.findElement(By.name("password")).sendKeys("admin@123");
//		driver.findElement(By.id("tdb1")).click();
		// driver.quit(); //Closes the browser

	}

}
