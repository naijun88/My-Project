package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelevantXPath {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
		System.out.println(innerText);
	}
}

// we can use the table's unique attribute (width="270") as the predicate
//table[@width="270"]/tbody/tr[4]/td, means the 4th row, the first column.
// xPath = //table[@width=\"270\"]/tbody/tr[4]/td

/*Second method to get xpath
copy with Firefox Developer Edition, get:
/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]
/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[4]/td[1]/font
Change into as below: 
1. Delete "/html/body/fiv/"
2.As below:
"//table/tbody/tr/td[2]"
+ "/table/tbody/tr[4]/td"
+ "/table/tbody/tr/td[2]"
+ "/table/tbody/tr[2]/td[1]"
+ "/table[1]/tbody/tr[3]/td"
+ "/table/tbody/tr[4]/td[1]/font"

                      
 */
 