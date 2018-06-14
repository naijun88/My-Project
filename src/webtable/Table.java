package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		String innerText = driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[3]/td[3]")).getText();
		System.out.println(innerText);
		driver.close();*/
		
		
		// This method is using for when the table is in deep HTML and xPath is so long and complex
		// Just give the table width size which holds the target the value
		/*driver.get("http://www.newtours.demoaut.com/");
		String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
		System.out.println(innerText);*/
		
		//Get text very deep in html remove the "html/body/div[1]/" in the xPath value, then add "//" then organize code as below:
		driver.get("http://www.newtours.demoaut.com/");
		String innerText = driver.findElement(By.xpath("//table/tbody/tr/td[2]"
				                                       + "/table/tbody/tr[4]/td"
				                                       + "/table/tbody/tr/td[2]"
				                                       + "/table/tbody/tr[2]/td[1]"
				                                       + "/table[2]/tbody/tr[3]/td[2]/font"))
				                                       .getText();
		System.out.println(innerText);
		

	}

}
