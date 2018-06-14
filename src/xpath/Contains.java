package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contains {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/v1/");
//Contains() is a method used in XPath expression. It is used when the value of any attribute changes dynamically, for example, login information.
	String s = driver.findElement(By.xpath("//*[contains(@class, 'barone')]")).getText();
	System.out.println(s);
	
	
	
	/*    "." and "//"is XPath abbreviated syntax. 
	"." selects the context node. 
	"//" td selects all the td descendants of the document root 
	and thus selects all td elements in the same document as the context node*/
	driver.get("http://demo.guru99.com/#");
	String s1 = driver.findElement(By.xpath("//td[contains(.,'Enter your email')]")).getText();
	System.out.println(s1);
	//or 
	//String s1 = driver.findElement(By.xpath("//*[contains(.,'Enter your email')]")).getText();
	//only above xpath is not working for "//td[contains(text(), 'Enter your email')]".
	
	String s2 = driver.findElement(By.xpath("//*[contains(text(), 'Enter your')]")).getText();
	System.out.println(s2);
	
	String s3 = driver.findElement(By.xpath("//li[contains(text(), 'Enter your')]")).getText();
	System.out.println(s3);
	
	String s4 = driver.findElement(By.xpath("//li[contains(text(), 'is allocated')]")).getText();
	System.out.println(s4);
	
	String s5 = driver.findElement(By.xpath("//li[contains(., 'valid for 20 days')]")).getText();
	System.out.println(s5);
	
	
	driver.get("http://store.demoqa.com/");
	driver.findElement(By.xpath("//li[contains(@class, 'rss')]")).click();
	//or
	///html/body/div[2]/div/div/footer/section[3]/div/ul/li[3]/a
	driver.findElement(By.xpath("//div[@id='social-media']/ul/li[3]/a")).click();
	
	///html/body/div[2]/div/div/footer/section[2]/ul/li[1]/a[2]/img
	driver.findElement(By.xpath("//ul[@class='group']/li[1]/a[2]/img")).click();
	
	driver.get("https://shop.nordstrom.com/");
	driver.findElement(By.xpath("//a[@class='mcp_1LuTk']/span/div/div")).click();
	driver.findElement(By.xpath("//span[contains(@class, 'rfx_3ISS2')]")).click();
	

}
}
