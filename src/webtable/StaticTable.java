package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticTable {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
	//Locate the table
	WebElement table = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table"));
	
	//To locate rows of table.
	List<WebElement> row_table = table.findElements(By.tagName("tr"));
	int row_count = row_table.size();
	System.out.println(row_count);
	
	//or locate row in table witout using located table xpath.
	/*List<WebElement> row = driver.findElements(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr"));
	int count_row = row.size();
	System.out.println(count_row);*/
	
	//locate columns in defining specific row = numbers of column
	List<WebElement> col_table = table.findElements(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td"));
	int col_count = col_table.size();
	System.out.println(col_count);
	
	
	//Locate the columns without defining specific row = numbers of cells
	List<WebElement> cell_table = table.findElements(By.tagName("td"));
	int cell_count = col_table.size();
	System.out.println(cell_count);
	for(int i=0; i<cell_count; i++)
	{
		String s = cell_table.get(i).getText();
		System.out.print(s);
	}
	
	driver.quit();
	
	
	
}
}
