package wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MutiWait {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	String eTitle = "Demo Guru99 Page";
	String aTtile = driver.getTitle();
	if(aTtile.contentEquals(eTitle))
	{
		System.out.println( "Test Passed") ;
	}
	else
	{
		System.out.println( "Test Failed" );
	}
	
//1. implicit wait: tells wedriver wait for certain amount of time before throwing noSuchElementException
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//2. explicit wait: tells webdriver wait for certain condition or maximum time exceed before throwing ElementNotVisibleException.
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*//[@class='rt-container']div[2]/div/ul/li[1]/a")));
	ele.click();
	
	Alert alt = wait.until(ExpectedConditions.alertIsPresent());
	alt.dismiss();
	alt.accept();
	
//3. Fluent wait tells webdriver wait certain condition or the frequency with which the condition we want to check before throwing
//   ElementNotVisibleException.
    FluentWait wait2 = new FluentWait(driver)
    		.withTimeout(10, TimeUnit.SECONDS)
    		.pollingEvery(10, TimeUnit.SECONDS)
    		.ignoring(NoSuchElementException.class);
    
    
   wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("q")));
   wait2.until(ExpectedConditions.alertIsPresent());
   
    
            
            
    		
           
    		
    		
    
    

	
}
}
