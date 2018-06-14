package test1package;

import org.openqa.selenium.By;

public class TestCase4 extends Methods
{

	public static void main(String[] args) 
	{
		//Create object/Instance
		TestCase4 object4 = new TestCase4();
		
		//Test Case1: Redirect to user interface from Admin interface.
		object4.launchBrowser();
		object4.adminLogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		
		if (url.equals("http://www.gcrit.com/build3/"))
		{
			System.out.println("Test Case1 - Redirect to User Interface - Passed");
		}
		else
		{
			System.out.println("Test Case1 - Redirect to User Interface - Failed");
		}
		object4.closeBrowser();
		
		//Test Case2: Admin Login Functionality with valid input
		object4.launchBrowser();
		object4.adminLogin();
		String url2 = driver.getCurrentUrl();
		
		if(url2.contains("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Test Case2 - Admin Login Successfull - Passed");
		}
		else
		{
			System.out.println("Test Case2 - Admin Login Usuccessfull - Failed");
		}
		object4.closeBrowser();
		
		//Test Case3: Admin Login Functionality with invalid input
		object4.launchBrowser();
		object4.adminLogin("admina", "admin@123a");
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		
		if (ErrorMessage.contains("Error: Invalid admin"))
		{
			System.out.println("Test Case3 - Handling invaild input - Passed");
		}
		else
		{
			System.out.println("Test Case3 - Not Handling invaild input - Failed");
		}
		object4.closeBrowser();
				

	}

}
