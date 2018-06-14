package test1package;

import org.openqa.selenium.By;

public class testCaseOne extends Methods
{

	public static void main(String[] args) 
	{
	    //Test case: Redirect to user interface from Admin interface.
	    // Create object/Instance
		testCaseOne object = new testCaseOne();
		object.launchBrowser();
		object.adminLogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		
		if (url.equals("http://www.gcrit.com/build3/"))
		{
			System.out.println("Redirect to User Interface - Passed");
		}
		else
		{
			System.out.println("Redirect to User Interface - Failed");
		}
		object.closeBrowser();
		
		

	}

}
