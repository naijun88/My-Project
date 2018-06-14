package LiveProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ownTest {

	public static void main(String[] args) throws InterruptedException 
	{
		//Test Case 6: 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.linkText("Categories/Products")).click();
		driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[173]/td/table/tbody/tr/td[2]/span[2]/a/span[2]")).click();
		boolean statusButon = driver.findElement(By.xpath("html/body/div[2]/form/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input[1]")).isSelected();
		driver.findElement(By.xpath("html/body/div[2]/form/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input[1]")).click();
		
		driver.findElement(By.id("products_date_available")).click();
		WebElement dateBox = driver.findElement(By.id("products_date_available"));
		dateBox.click();
		driver.findElement(By.xpath("html/body/div[4]/div/a[2]/span")).click();
		driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr[3]/td[4]/a")).click();
		
		
		Select dropDown = new Select(driver.findElement(By.name("manufacturers_id")));
		dropDown.selectByValue("2112");
		
		driver.findElement(By.name("products_name[1]")).click();
		driver.findElement(By.name("products_name[1]")).sendKeys("Hello Cat");
		
		Select dropDown1 = new Select(driver.findElement(By.name("products_tax_class_id")));
		dropDown1.selectByIndex(1);
		
		driver.findElement(By.name("products_price")).click();
		driver.findElement(By.name("products_price")).sendKeys("8");
		
		driver.findElement(By.name("products_price_gross")).click();
		driver.findElement(By.name("products_price_gross")).sendKeys("8.8");
		
		driver.findElement(By.name("products_description[1]")).click();
		driver.findElement(By.name("products_description[1]")).sendKeys("Cute hello cat for kids.");
		
		driver.findElement(By.name("products_quantity")).click();
		driver.findElement(By.name("products_quantity")).sendKeys("100");
		
		driver.findElement(By.name("products_model")).click();
		driver.findElement(By.name("products_model")).sendKeys("V1009");
		
		WebElement Browse = driver.findElement(By.name("products_image"));
	    Browse.sendKeys("/Users/shimeiblanco/Downloads/helloCat.jpg");
	  
	    driver.findElement(By.name("products_url[1]")).sendKeys("www.helloCar.com");
	    driver.findElement(By.name("products_weight")).sendKeys("20");
	    
	    driver.findElement(By.id("tdb1")).click();
	    
		
		
		
		
	
	}

}
