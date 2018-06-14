package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class6 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/webform/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		radio2.click();
		
		WebElement checkbox1 = driver.findElement(By.name("webform"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		checkbox2.click();
		
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
		
		for(int i = 0; i < 3; i++) // Select the thired check box three times.
		{
			checkbox3.click();
			System.out.println("The third check box is Selected");
		}
		
		if (checkbox3.isSelected())
			System.out.println("The third check box is toggle on");
		else
			System.out.println("The third check box is toggle off");
		
		checkbox3.click();
		if (!checkbox3.isSelected())
			System.out.println("The third check box is toggle off");
		else
			System.out.println("The third check box is toggle on");
       
	}

}
