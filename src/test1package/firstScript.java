package test1package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class firstScript
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle))
        {
            System.out.println("Test Passed!");
        } 
        else 
        {
            System.out.println("Test Failed");
        }
        driver.close();

	}
	
    
}
