package webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmalTable {
public static void main(String[] args){
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://toolsqa.wpengine.com/automation-practice-table");	
//Get the value from cell ‘Dubai’ with using dynamic xpath
String row = "1";
String col = "2";
String s = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/table/tbody/tr[" +row+ "]/td[" +col+ "]")).getText();
System.out.println(s);
//Print all the column values of row ‘Clock Tower Hotel’
for(int i=1; i<=5; i++)
{
	String a = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" +i+ "]/th")).getText();
	if(a.equalsIgnoreCase("Clock Tower Hotel"))
	{
		for(int j=1; j<=6; j++)
		{
			String b = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" +i+ "]/td[" +j+ "]")).getText();
			System.out.println(b);
		}
		break;
	}
}
}
}

//print out all the values belong to 3th row.
/*for(int i=1; i<=5; i++)
{
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/table/tbody/tr[3]/td[" +i+ "]")).getText());
}*/
