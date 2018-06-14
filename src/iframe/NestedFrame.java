package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/popup.php");//assume a url
	
	//total number of frames
	int count = driver.findElements(By.tagName("frame")).size();
	System.out.println("Total number of frames is: " + count);
	
	driver.switchTo().frame(0); // Switching the Outer Frame  
	//Printing the text in outer frame
	System.out.println(driver.findElement(By.xpath("xpath of the outer element")).getText());
	
	 // prints the total number of frames inside outer frame        
	count = driver.findElements(By.tagName("frame")).size();
	System.out.println("Total Frames --" + count);
	driver.switchTo().frame(0); // Switching to innerframe
	//Printing the text in inner frame
	System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
	driver.switchTo().defaultContent();
}
}
