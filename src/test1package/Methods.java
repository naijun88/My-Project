package test1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods 
{
	public static WebDriver driver;
	//Launch browser
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
	}
	//Admin Login without parameter
	public void adminLogin()
	{

		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}
	// Admin Login with parameter
	public void adminLogin(String username, String password)
	{
        
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}
    //Close browser
    public void closeBrowser()
    {
    	if(! driver.toString().contains("null"))
    	{
    		driver.close();
    	}
    }
	public static void main(String[] args) 
	{
		Methods object = new Methods();
		object.launchBrowser();
		object.adminLogin();
		object.closeBrowser();
		object.launchBrowser();
		object.adminLogin("admin", "admin@123");
		object.closeBrowser();
		
		
	

	}

}

//or 
/*public class Methods 
{
	public void adminLogin()
	{
		
        WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}
	


	public static void main(String[] args) 
	{
		Methods object = new Methods();
		object.adminLogin();
		
	

	}

}
*/