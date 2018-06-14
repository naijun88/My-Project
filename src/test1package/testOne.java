package test1package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testOne 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.store.demoqa.com");
		System.out.println("Successfully login");
		try
		{
			 Thread.sleep(5000);
		}
		catch (InterruptedException ie1)
		{
			 ie1.printStackTrace();
		} 
		driver.close();
		
		
		
		
	}

}
