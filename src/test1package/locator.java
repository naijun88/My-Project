package test1package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator 
{
	public static void main(String[] args)
	{
		WebDriver driver  = new FirefoxDriver();
		String baseUrl = "http://www.facebook.com";
		driver.get("http://www.facebook.com");
		String tagName = driver.findElement(By.className("inputtext")).getTagName();
	    System.out.println(tagName);
		driver.close();
		System.exit(0);
	}
	
	
	

}
