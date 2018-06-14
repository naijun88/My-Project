package test1package;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class handlingElement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Extra: Return the value.
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("Edison");
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("type"));
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));*/
		
		WebDriver driver = new FirefoxDriver();
		/*//1. Handle Image.
		//I. General Image (No functionality)
		driver.get("https://www.google.com/imghp?hl=en&tab=wi");
		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());// true
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));
		System.out.println(driver.findElement(By.id("hplogo")).getText());
		
		
		//II. Image Button (Submit)
		driver.navigate().to("http://newtours.demoaut.com/");
		System.out.println(driver.findElement(By.name("login")).getAttribute("type"));
		driver.findElement(By.name("login")).click();
		
		
		//III.  Image Link (Directs to another page/location)
		driver.navigate().to("http://docs.seleniumhq.org");
		driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
		*/
		
		
		//2. Handle Link
		// Click the Link.
		//driver.get("https://www.google.com/");
		//driver.findElement(By.className("gb_P")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("mail")).click();
		//driver.findElement(By.cssSelector(".gb_P")).click();
		//driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		
			
		// Check Link existence and enable status
		/*driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.className("gb_P")).isDisplayed());//true
		System.out.println(driver.findElement(By.className("gb_P")).isEnabled());//true
*/		
		
		
		//#Second Method
				/*WebElement Gmail_Link = driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
				boolean Link_states = Gmail_Link.isDisplayed();
				System.out.println(Link_states);
				Link_states = Gmail_Link.isEnabled();
				System.out.println(Link_states);
				
				
				String Link_Name = Gmail_Link.getText();
				System.out.println(Link_Name);
				Gmail_Link.click();
		*/
		
      //3. Handle Radio Button.
		        /*driver.get("http://www.gcrit.com/build3/create_account.php");
		        WebElement maleRadioButton = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		        boolean statusButton = maleRadioButton.isDisplayed();
		        System.out.println(statusButton);//true
		        System.out.println(maleRadioButton.isEnabled());//true
		        System.out.println(maleRadioButton.isSelected());//false
		        maleRadioButton.click();
		        System.out.println(maleRadioButton.isSelected());//true
		        */
		
		
		// 4. Handle drop down list
		       //driver.get("http://www.gcrit.com/build3/create_account.php");
		       //Select dropDown = new Select (driver.findElement(By.name("country")));
		       //dropDown.selectByIndex(2);//select a item by index
		       //dropDown.selectByValue("2");// select a item by "value"
		       //dropDown.selectByVisibleText("China");//select a item by text
		
		
		       /*List<WebElement> e = dropDown.getOptions();
		       int itemsCount = e.size();
		       System.out.println(itemsCount);
		*/
		
		 // ##Second methods
		       /*driver.get("http://www.gcrit.com/build3/create_account.php");
		       WebElement dropCountry = driver.findElement(By.name("country"));
		       boolean dropStatus = dropCountry.isDisplayed();
		       System.out.println(dropStatus);
		       System.out.println(dropCountry.isEnabled());*/
		       
		//5. Handle check box
		      /* driver.get("https://www.computerhope.com/jargon/c/checkbox.htm");
		       System.out.println(driver.findElement(By.id("Example-2")).isDisplayed());//T
		       System.out.println(driver.findElement(By.id("Example-2")).isEnabled());//T
		       System.out.println(driver.findElement(By.id("Example-2")).isSelected());//F
		       driver.findElement(By.id("Example-2")).click();
		       System.out.println(driver.findElement(By.id("Example-2")).isSelected());//T
		       driver.findElement(By.id("Example-2")).click();
		       System.out.println(driver.findElement(By.id("Example-2")).isSelected());//F
*/		       
		       
		      //6. Handle Web Table and HTML Table
		       /*driver.get("https://www.w3schools.com/html/html_tables.asp");
		       String s = driver.findElement(By.xpath(".//*[@id='customers']/tbody/tr[2]/td[3]")).getText();
		       System.out.println(s);
		       WebElement htmlTable = driver.findElement(By.xpath(".//*[@id='main']/div[3]/div"));
		       
		       List <WebElement> rows = htmlTable.findElements(By.tagName("tr"));//tr = table rows
		       int r = rows.size();
		       System.out.println(r);
		       
		       List <WebElement> cells = htmlTable.findElements(By.tagName("td"));//td = table data
		       int c = cells.size();
		       System.out.println(c);*/
		       
		//7. Handle inLine Element
		      
		      
		       
		     
		       /*//driver.navigate().back();
		         driver.get("http://shop.nordstrom.com/");
		         driver.findElement(By.xpath(".//*[@id='rfx-main-header']/div/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/a/span")).click();
		         driver.findElement(By.xpath(".//*[@id='rfx-main-header']/div/div[1]/div[2]/div/div[4]/div/aside/div[2]/div/ul/li[2]/a/span")).click();
		         driver.findElement(By.xpath(".//*[@id='rfx-main-header']/div/div[1]/div[2]/div/div[4]/div/aside/div[2]/div/ul/li[1]/a")).click();
		        
		       */
		         driver.get("https://www.middlesexcc.edu/");
		         driver.findElement(By.xpath(".//*[@id='powertour-demo-box-2']/div/a[2]")).click();
		         driver.findElement(By.xpath(".//*[@id='menu-item-12038']/a")).click();
		        
		    
		       
		       
		       
		
		
	}

}
