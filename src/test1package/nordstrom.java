package test1package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class nordstrom 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://shop.nordstrom.com");
	    String expectedTitle = "Nordstrom Online & In Store: Shoes, Jewelry, Clothing, Makeup, Dresses";
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}
		

}
