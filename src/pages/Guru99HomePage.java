package pages;//the package should be "page".

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Guru99 Home Page POM
public class Guru99HomePage {
WebDriver driver;
By homePageUserName = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");

public Guru99HomePage(WebDriver driver)
{
	this.driver = driver;
}

//Get the User name from Home Page
public String getHomePageDashboardUserName()
{
	return driver.findElement(homePageUserName).getText();
}

}
