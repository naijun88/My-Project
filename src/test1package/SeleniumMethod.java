package test1package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumMethod {

	public static void main(String[] args) {
		
		//1. get() method.
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		
		//2. getTitle() method.
		//String Title = driver.getTitle();
		//System.out.println(Title);
		
		//3. getpageSource() method.
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		//4. getCurrentUrl() method.
		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		//Browser Navigation methods1 - navigate to
		//5. navigate().to("URL").
		//driver.navigate().to("https://www.yahoo.com/");
		//URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		//Browser Navigation methods2
		//driver.findElement(By.linkText("Gmail")).click();
		//URL = driver.getCurrentUrl();
		//System.out.println(URL);
		//driver.navigate().back();
		//Browser navigation - navigate back to
		//driver.navigate().back();
		//URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		//Browser navigation - navigate forward 
		//driver.navigate().forward();
		//URL = driver.getCurrentUrl();
		//System.out.println(URL);
	
		//Browser navigation - navigate refresh
		//driver.navigate().refresh();
		//URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		// Close method
		//Thread.sleep(10000);
		//driver.close();
		
		// find Element 
		//driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		// sendKeys
		//driver.get("https://www.google.com/");
		//driver.findElement(By.id("gs_htif0")).sendKeys("China");
		//driver.findElement(By.className("gsfi")).clear();
		
		// Organizing the object
		//WebElement gs_htif0 = driver.findElement(By.id("gs_htif0"));
		//gs_htif0.sendKeys("China");
		
		// isEnable()
		//driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//boolean a = driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isEnabled();
		//System.out.println(a);
		
		// isDisplayed()
		//driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//boolean a = driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).isDisplayed();
		//System.out.println(a);
		
		// isSlected
		/*driver.get("http://store.demoqa.com/products-page/your-account/");
		boolean a = driver.findElement(By.id("rememberme")).isSelected();
		System.out.println(a);
		driver.findElement(By.id("rememberme")).click();
		a = driver.findElement(By.id("rememberme")).isSelected();
		System.out.println(a);*/
		
		// maximize the window of browser
		//driver.get("http://store.demoqa.com/products-page/your-account/");
		//driver.manage().window().maximize();
	
		
		
		
		
		
		
		

	}

}
