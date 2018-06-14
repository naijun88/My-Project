package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr96411");
		driver.findElement(By.name("password")).sendKeys("usetuna");
		driver.findElement(By.name("btnLogin")).submit();
		String s = driver.getTitle();
		System.out.println(s);
		String titleHome = "Guru99 Bank Home Page";
		if (titleHome.equals(driver.getTitle()))
				System.out.println("Login Successfully - Passed");
		else
			System.out.println("Login Unsuccessfully - Failed");
			
		driver.close();
		

	}

}
