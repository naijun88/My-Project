package accesslink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindBrokenLinks {
public static List findAllLinks(WebDriver driver)
{
	List<WebElement> eleList = new ArrayList();
	eleList = driver.findElements(By.tagName("a"));
	eleList.addAll(driver.findElements(By.tagName("img")));
	
	List finalList = new ArrayList();
	for(WebElement ele : eleList)
	{
		if(ele.getAttribute("href")!=null)
		{
			finalList.add(ele);
		}
	}
	return finalList;
}
public static String isLinkBroken(URL url) throws Exception
{
	//url = new URL("http://yahoo.com");
	String response = "";
	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	try{
		connection.connect();
		response = connection.getResponseMessage();
		connection.disconnect();
		return response;	
	}catch(Exception e)
	{
		return e.getMessage();
	}
}
public static void main(String[] args)
{
	FirefoxDriver ff = new FirefoxDriver();
	ff.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	//ff.get("http://www.yahoo.com/");		
	List<WebElement> allImages = findAllLinks(ff);
	System.out.println("Total number of elements found "+allImages.size());
	for(WebElement ele : allImages)
	{
		try{
			System.out.println("URL: "+ele.getAttribute("href")+" returned "+ isLinkBroken(new URL(ele.getAttribute("href"))));
			
		}catch(Exception e)
		{
			System.out.println("At "+ele.getAttribute("innerHTML")+" Exception occured "+ e.getMessage());
		}
	}
}
}
