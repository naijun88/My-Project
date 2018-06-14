package test1package;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WritingTeseCase1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Test case 1 - Verification on the internal and external link.
		/*WebDriver driver = new FirefoxDriver();
		driver. get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		//System.out.println(url);
		if (url.contains("wikipedia.org"))
		{
			System.out.println("It is an internal link - Redirect to anther page in the same Application - Passed");
			
		}
		
		else
		{
			System.out.println("It is an external link - Redirect to anther page in other Application - Failed");
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		url = driver.getCurrentUrl();
		
		if (! url.contains("wikipedia.org"))
		{
			System.out.println("It is an external link - Redirect to anther page in other Application - Passed");
		}
			
		else
		{
			System.out.println("It is an internal link - Redirect to anther page in the same Application - Failed");
		}
		driver.close();
*/      
		
		// Test Case 2 - Verification Gmail link existence in google home page.
		//Methods 1
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		if (driver.findElement(By.linkText("Gmail")).isDisplayed())
		{
			System.out.println("Gmail link exists - Passed");
		}
		
		else
		{
			System.out.println("Gmail link Not exists - Failed");
		}*/
		
		//Method 2 - boolean
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		boolean existence = driver.findElement(By.linkText("Gmail")).isDisplayed();	
		if (existence == true)
		{
			System.out.println("Gmail link exists - Passed");
		}
		else
		{
			System.out.println("Gmail link Not exists - Failed");
		}*/
		
		//negative scenario - handling exception
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		try
		{
			if (driver.findElement(By.linkText("Gtmail")).isDisplayed())
			{
				System.out.println("Gmail link exists - Passed");
			}
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Gmail link Not exists - Failed");
		}
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		// Test Case 3 - Login to Indian Railways Online web portal
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/home");
		driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
		driver.findElement(By.className("loginPassword")).sendKeys("gld938");
		
		Scanner scan = new Scanner(System.in);//System.in is input String.
		System.out.println("Enter the Captcha: ");
		String captcha = scan.nextLine();
		driver.findElement(By.id("nlpAnswer")).sendKeys("captcha");
		driver.findElement(By.id("loginbutton")).click();
		String url = driver.getCurrentUrl();
		
		if (url.equals("https://www.irctc.co.in/eticketing/home"))
		{
			System.out.println("Login Successfull - Passed");
		}
		else
		{
			System.out.println("Login Unsuccessfull - Failed");
		}
		driver.close();*/
		
		
		
		// Test case - 4 Verify Customer Registration
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("junjun");
		driver.findElement(By.name("lastname")).sendKeys("Xiao");
		driver.findElement(By.name("dob")).sendKeys("05/18/1988");
		driver.findElement(By.name("email_address")).sendKeys("junjunxiao123@icloud.com");
		driver.findElement(By.name("street_address")).sendKeys("18 abcde");
		driver.findElement(By.name("postcode")).sendKeys("10086");
		driver.findElement(By.name("city")).sendKeys("Garden");
		driver.findElement(By.name("state")).sendKeys("Flower");
		
		Select Dropdown = new Select (driver.findElement(By.name("country")));
		Dropdown.selectByVisibleText("India");
		
		driver.findElement(By.name("telephone")).sendKeys("9876543210");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.name("confirmation")).sendKeys("abcd123");
		
		driver.findElement(By.id("tdb4")).click();
		
		String confirmationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		
		if (confirmationMessage.equals("Your Account Has Been Created!"))
		{
			System.out.println("Customer Registration Successfully - Passed");
		}
		else
		{
			System.out.println("Customer Registration Unsuccessfully - Failed");
		}
		driver.close();
		*/
		
		
		//Test Case - 5 Verify Customer Login in gcrShop Web portal.
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("junjunxiao123@icloud.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.id("tdb5")).click();
		
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/index.php"))
		{
			System.out.println("Login successfull = Passed");
		}
		else
		{
			System.out.println("Login Unuccessfull = Failed");
		}
		
		
		
		
			
		
		
		
	}

}
