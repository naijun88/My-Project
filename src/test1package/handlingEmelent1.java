package test1package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;






public class handlingEmelent1 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	    //driver.get("https://www.google.com/");
		/*String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);*/
		
		
		
		/*driver.navigate().to("https://www.yahoo.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();*/
		//driver.close();
		//driver.quit();
		
		
		//finding edit box with ID element4
		//Enter the value
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.id("identifierId")).sendKeys("China");
		//Thread.sleep(5000);
		
		//clear the value
		//driver.findElement(By.id("identifierId")).clear();
		
		// return type of object
		//driver.findElement(By.id("identifierId")).getAttribute("type");
		
		//String s = driver.findElement(By.id("identifierId")).getAttribute("value");
		//System.out.println(s);
		

		
		/*// second method
		WebElement identifierId = driver.findElement(By.id("identifierId"));
		identifierId.sendKeys("New");
		
		
		
		// return type of object
		identifierId.getAttribute("type");
		System.out.println(identifierId.getAttribute("type"));
		
		// return the value
		identifierId.getAttribute("value");
		System.out.println(identifierId.getAttribute("value"));
		
		//System.out.println(identifierId.getText());// It is now working.
		
		// return the displayed status
		System.out.println(identifierId.isEnabled());
		
		
		// return the enabled status
		System.out.println(identifierId.isDisplayed());
		*/
		//handling the text area
		//String s = driver.findElement(By.xpath(".//*[@id='headingSubtext']")).getText();
		//System.out.println(s);
		
		
		//* capture error message
		/*driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-signin")).click();
		driver.findElement(By.name("signin")).click();
		String ErrorMessage = driver.findElement(By.id("username-error")).getText();
		System.out.println(ErrorMessage);*/
		
		
		/*// ****Handling the windows popup error message.
		driver.get("http://www.rediff.com/");
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		String Error_Message = alert.getText();
		System.out.println(Error_Message); // Return Error message.
		
		alert.dismiss(); //  ok button on the popup message.
		// or 
		alert.accept(); //  ok button on the popup message.
*/		
	
		//organize the code
		//driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		/*driver.findElement(By.id("identifierId")).sendKeys("China");
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
		*/
		
		/*
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isEnabled());
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).getAttribute("type"));// just a sample it is not working
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).getText());
		
		*/
		
		
				
		
		
		

	}

}
