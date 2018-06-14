package test1package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementOne
{
	public static void main(String[] args)
	{
		WebDriver driver  = new FirefoxDriver();
		//driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		// *id.method1
		//WebElement identifierId = driver.findElement(By.id("identifierId"));
		//identifierId.sendKeys("London");
		
		// *id.method2
		//driver.findElement(By.id("identifierId")).sendKeys("London");
		
		// *name.method1
		//WebElement identifier = driver.findElement(By.name("identifier"));
		//identifier.sendKeys("London");
		//identifier.clear();
		
		
		// *name.mthod2
		//driver.findElement(By.id("identifier")).sendKeys("London");
		
		
		// *class.method1
		//driver.get("http://store.demoqa.com/products-page/your-account/");
		//WebElement text = driver.findElement(By.className("text"));
		//text.sendKeys("London");
		
		
		
		// *class.methods2 use 2nd url
		//driver.findElement(By.className("text")).sendKeys("China");
		//driver.findElement(By.className("text")).clear();
		
		// *tagName method1 use first url
		//WebElement input = driver.findElement(By.tagName("input"));
		//input.sendKeys("Dalian");
		
		// *tagName method2 use first url
		//driver.findElement(By.tagName("input")).sendKeys("Dalian");
		
		
		
		// *linkText method
		//driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		
		// *partial linkText method
		//driver.get("https://www.google.com/");
		//driver.findElement(By.partialLinkText("Gma")).click();
		
		// *cssSelector
		//driver.get("https://www.google.com/");
		//driver.findElement(By.cssSelector("#gs_htif0")).sendKeys("Good");
		
		
		// * xpath method 
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
	

}
