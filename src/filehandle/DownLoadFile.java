package filehandle;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*WebDriver has no capability to access the Download dialog boxes presented by browsers
 when you click on a download link or button. However, we can bypass these dialog boxes 
 using a separate program called "wget".
 */

/*Wget is a small and easy-to-use command-line program used to automate downloads. 
 Basically, we will access Wget from our WebDriver script to perform the download process.
 */


public class DownLoadFile {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/selenium/yahoo.html");
	WebElement downLoad = driver.findElement(By.id("messenger-download"));
	String sourceLoaction = downLoad.getAttribute("href");
	String wget_command = "/Users/shimeiblanco/Downloads/wget.exe -P /Users/shimeiblanco/Downloads --no-check-certificate " + sourceLoaction;
	try
	{
		Process exec = Runtime.getRuntime().exec(wget_command);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
     } 
	catch (InterruptedException | IOException ex) 
	{
        System.out.println(ex.toString());
    }
     driver.close();
}
}
