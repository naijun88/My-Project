package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Asserts {
private static WebDriver driver;
@Test
public void f()
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	
	// Here driver will try to find out My Account link on the application
	WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));
	//Test will only continue, if the below statement is true
	//This is to check whether the link is displayed or not
	Assert.assertTrue(myAccount.isDisplayed());
	 //My Account will be clicked only if the above condition is true
	myAccount.click();
}

/*Assert true statement fails the test and stop the execution of the test, if the actual output is 
false.  Assert.assertFalse() works opposite of Assert.assertTrue(). It means that if you want your 
test to continue only if when some certain element is not present on the page. You will use Assert 
false, so it will fail the test in case of the element present on the page.*/
@Test
public void test()
{
	String sValue="Lakshay Sharma";
	System.out.println("what is your full name?");
	Assert.assertEquals("Lakshay Sharma", sValue);
	System.out.println(sValue);
}
}

/*It also works the same way like assert true and assert fail. It will also stop the execution, 
if the  value is not equal and carry on the execution, if the value is equal.
*/

