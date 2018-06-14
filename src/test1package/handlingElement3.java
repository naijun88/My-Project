package test1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingElement3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		// * Handle frame.
		//driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		/*driver.switchTo().frame(2);// frame index
	    driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		// or
		driver.switchTo().frame(1);
		driver.findElement(By.className("interfaceName")).click();*/
	    
	    
	   /* driver.switchTo().frame("classFrame"); // frame name.
	    driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
	    // or
	    driver.switchTo().frame("packageFrame");
	    driver.findElement(By.className("interfaceName")).click();*/
		
		
		/*driver.switchTo().frame("packageFrame");
		driver.findElement(By.className("interfaceName")).click(); // switch to 3rd frame.
		Thread.sleep(5000);
		driver.switchTo().defaultContent(); // switch from 3rd frame to Top window.driver.
		Thread.sleep(5000);
		driver.switchTo().frame(0); //switch to the first frame.
	    driver.findElement(By.linkText("com.thoughtworks.selenium")).click();*/
	    
	    
		// Handle mouse hover
		/*driver.get("https://www.carmax.com/");
		// Create Action builder instance by passing WebDriver instance.
		Actions builder  = new Actions(driver);
		WebElement menuElement = driver.findElement(By.linkText("Sell Your Car"));
		builder.moveToElement(menuElement).build().perform();
		driver.findElement(By.linkText("Learn More")).click();*/
		
		
		//Handle duplicate objects
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php"))// to distinguish the different URL 
		{
			driver.findElement(By.linkText("Online Catalog")).click();// because Online Catalog has same value on loign page and After login page.
		}
		
		//driver.findElement(By.linkText("Online Catalog")).click();
		System.out.println(driver.getCurrentUrl());
	    
		

	}

}
