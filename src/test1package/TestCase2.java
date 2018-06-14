package test1package;

public class TestCase2 extends Methods
{

	public static void main(String[] args)
	{
		// Test case 2 - Admin Login Functionality with valid input(positive)
		//Create object
		TestCase2 object = new TestCase2();
		object.launchBrowser();
		object.adminLogin();
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Admin Login Successfull - Passed");
		}
		else
		{
			System.out.println("Admin Login Usuccessfull - Failed");
		}
		object.closeBrowser();

	}

}
