package webtable;

import java.text.NumberFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import bsh.ParseException;

public class Dynamic2 
{

	public static void main(String[] args) throws ParseException, java.text.ParseException
	{
		//Get maximum value of one specific column
		WebDriver driver = new FirefoxDriver();
		String max;
		double m = 0, r = 0;
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		
		List <WebElement> col = driver.findElements(By.tagName("th"));
		System.out.println("Number of columns are: " + col.size());
		
		// rows not include title
		List <WebElement> rows = driver.findElements(By.xpath("html/body/div[1]/div[5]/table/tbody/tr"));
		System.out.println("Number of rows are: " + rows.size());
		
		for (int i = 1; i <= rows.size(); i++)
		{
			max = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr["+ (i+1)+"]/td[4]")).getText();
			NumberFormat f =NumberFormat.getNumberInstance(); 
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if (m > r)
			{
				r += m;
				
			}
					
			
		}
		System.out.println("Max is: " + r);
		driver.close();
		
		

	}

}
