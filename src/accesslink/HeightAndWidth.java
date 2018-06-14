package accesslink;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeightAndWidth {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.DemoQA.com");
	WebElement e = driver.findElement(By.linkText("Registration"));
	Dimension d = e.getSize();//get size
	System.out.println("Height is "+d.height+ " and the width is "+d.width);
	
	Point p = e.getLocation();//get location
	System.out.println("X is "+p.x+ " and Y is "+p.y);//get X and Y coordinates of the element.
	
		
}
}
