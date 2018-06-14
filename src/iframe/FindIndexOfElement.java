package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindIndexOfElement {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	
	int count = driver.findElements(By.tagName("iframe")).size();//or int count1 = driver.findElements(By.xpath("//iframe")).size();
	for(int i=0; i<=count; i++)	
	{
		driver.switchTo().frame(i);
		int total = driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	}
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	System.out.println("********We are switched to the iframe*******");
	//Clicking the element in line with Advertisement
	driver.findElement(By.xpath("html/body/a/img")).click();
	System.out.println("*********We are done***************");

/*Wherever you find the '1' in output that is the index of Frame by which the element is 
 being loaded. Since the index of the iframe starts with '0' if you find the 1 in the 1stplace, 
 then the index is 0. If you find 1 in 3rd place, the index is 2.*/
}
}
