package dateandtime;

import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dateTimeCalendar 
{
  @Test
  public void Calendar() throws Exception
  {
	  WebDriver driver = new FirefoxDriver();
	  String dateTime ="12/07/2014 2:00 PM";
	  driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebElement selectDate = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div/span/span/span[2]/span[1]/span"));
	  selectDate.click();
	  
	  // Button to move next in calendar.
	  WebElement nextLink = driver.findElement(By.xpath("html/body/div[5]/div/div/div[1]/a[3]/span"));
	  
	  // button to click the central of the calendar header
	  WebElement midLink = driver.findElement(By.xpath("html/body/div[5]/div/div/div[1]/a[2]"));
	  
	  // button to move previous month in the calendar
	  WebElement preLink = driver.findElement(By.xpath("html/body/div[5]/div/div/div[1]/a[1]/span"));
	  
	  // Split the date time to get only the date part
	  String date_dd_MM_YYYY[] = (dateTime.split(" ")[0]).split("/");
	  
	  // get the year difference between current year and year to set in the calendar
	  int yearDiff = Integer.parseInt(date_dd_MM_YYYY[2]) - Calendar.getInstance().get(java.util.Calendar.YEAR);
	  
	  midLink.click();
	  
	  if (yearDiff!=0)
	  {
		  //if you have to move to next year
		  if (yearDiff > 0)
		  {
			  for(int i = 0; i < yearDiff; i ++)
			  {
				  System.out.println("Year Diff -> " + i);
				  nextLink.click();
			  }
		  }
		  
		  // if you have to move to previous year
		  else if (yearDiff < 0)
		  {
			  for (int i = 0; i < (yearDiff*(-1)); i++)
			  {
				  System.out.println("Year Diff -> " + i);
				  preLink.click();
			  }
		  }
	  }
	  Thread.sleep(10000);
	  // Get all months from calendar to select correct one.
	 
	  List<WebElement> list_AllMonthBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"));
	  list_AllMonthBook.get(Integer.parseInt(date_dd_MM_YYYY[0])-1).click();
	  
	  Thread.sleep(1000);
	  
	  // Get all dates from calendar to select correct
	  List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"));
	  list_AllDateToBook.get(Integer.parseInt(date_dd_MM_YYYY[1])+0).click();
	  
	  // Time
	  WebElement selectTime = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div/span/span/span[2]/span[2]/span"));
	  selectTime.click();
	  
	  //Get list of time
	  List<WebElement> allTime = driver.findElements(By.xpath("html/body/div[6]/div/ul/li[29]"));
	  dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];
	  
	  //Select correct time
	  for (WebElement webElement : allTime)
	  {
		  if(webElement.getText().equalsIgnoreCase(dateTime))
		  {
			  webElement.click();
		  }
			  
	  }
		  
	  
	  
	  
	  
	  
  }
 
  
}
