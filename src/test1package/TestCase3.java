package test1package;

import org.openqa.selenium.By;

public class TestCase3 extends Methods
{

	public static void main(String[] args) 
	{
		//Test Case - Admin Login Functionality with invalid input(Negative)
		//Create object
		TestCase3 object = new TestCase3();
		object.launchBrowser();
		object.adminLogin("admina", "admin@123a");
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		
		if (ErrorMessage.contains("Error: Invalid admin"))
		{
			System.out.println("Handling invaild input - Passed");
		}
		else
		{
			System.out.println("Not Handling invaild input - Failed");
		}
		object.closeBrowser();
		
		

	}

}
