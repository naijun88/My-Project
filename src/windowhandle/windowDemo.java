package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class windowDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("html/body/p/a")).click();
		
		String mainWindow = driver.getWindowHandle();
		
		//To handle all new opened windows
		Set <String> s1 = driver.getWindowHandles();
		Iterator <String> i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			
			String ChildWindow = i1.next();
			if(!mainWindow.equals(ChildWindow))
			{
				//Switch to Child Window
				driver.switchTo().window(ChildWindow);
 
				Thread.sleep(3000);

				String title = driver.getTitle();
				System.out.println("title: " + title);
				
			
			
				String s = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td")).getText();
				System.out.println(s);
				
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.name("btnLogin")).submit();
				driver.close();
				
			}
		
		}
		driver.switchTo().window(mainWindow);
		
	
		

	}

}
