package test1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingTestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test case 1 - Check Admin Login functionality in gcrShop web portal - Positive
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Admin login successfully - Passed");
		}
		else
		{
			System.out.println("Admin login unsccessfully - Failed");
		}
		driver.close();*/
		
		
		// Test case 2 - Check Admin Login functionality in gcrShop web portal - Negative
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admina");//passed.
		//driver.findElement(By.name("username")).sendKeys("admin");// Failed
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/admin/login.php?action=process"))
		{
			String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
			if (ErrorMessage.contains("Invalid administrator login attempt"))
			{
				System.out.println("Handling invalid input - Passed");
			}
			
		}
		else
		{
			System.out.println("Not Handling invalid input - Failed");
		}*/
		
		
		// test case - 3 Verify the maximum Login attempts times.(For invalid input only)
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admin");//1st
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).sendKeys("admin");//2nd
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("username")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("admin");//3rd
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");//4th
		driver.findElement(By.id("tdb1")).click();
		
		
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		if (ErrorMessage.contains("Error: The maximum number of login attempts has been reached. Please try again in 5 minutes."))
		{
			System.out.println("Maximum invalid attempt successfully - Passed");
		}
		else
		{
			System.out.println("Maximum invalid attempt unsuccessfully - Passed");
		}
		*/
		
		
		
		

		

	}

}
