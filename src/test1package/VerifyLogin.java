package test1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin 
{
	static int i;
	static String username, password, iteration;

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		for (i = 1; i <= 2; i++)// i >= 2: one is positive, other one is negative.
		{
			if (i == 1)
			{
				username = "admin";
				password = "admin@123";
				iteration = "Iteration 1:";					
			}
			else if(i == 2)
			{
				username = "admina";
				password = "admin@123a";
				iteration = "Iteration 2:";		
			}
			driver.get("http://www.gcrit.com/build3/admin");
			driver.findElement(By.name("username")).sendKeys("username");
			driver.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(3000);
			driver.findElement(By.id("tdb1")).click();
			
			String url = driver.getCurrentUrl();
			if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
			{
				System.out.println(iteration + ("Input data: ") + username  + ", " + password + " Admin Login Successfully - Passed");
				driver.findElement(By.linkText("Logoff")).click();
				Thread.sleep(2000);
			}
			
			else if (! url.contains("http://www.gcrit.com/build3/admin/index.php"))
			{
				
				String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
				if (ErrorMessage.contains("Invalid administrator login attempt"))
				{
					System.out.println(iteration + ("Input data: ") + username  + ", " + password + " Handling Invalid Input - Passed");
				}
				else
				{
					System.out.println(iteration + " - Failed");
				}
			}
				
			
			
		}
		
        driver.close();
	}

}
