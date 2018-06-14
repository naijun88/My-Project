package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Try to locate the cell in the 3rd rows and 2nd column
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement tableRow = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[3]/td[2]"));
		//Get the row 3 and column 2 value
		System.out.println(tableRow.getText());

		
		
		//or use dynamic xpath to locate the cell in the 3rd row and 2nd column
		String row = "3";
		String column = "2";
		String cell_text = driver.findElement(By.xpath("......./tr[" +row+ "]/td[" +column+ "]")).getText();
		System.out.println(cell_text);
		
		
		//Other method
        driver.findElement(By.tagName("table"));
		
		//Get text from row 3of the table.
		String s = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[3]")).getText();
		System.out.println(s);
		
		
		//Get the row 3 and column 2 value
		String s1 = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[3]/td[2]")).getText();
		System.out.println("Column value is: " + s1);
		
	}

}
