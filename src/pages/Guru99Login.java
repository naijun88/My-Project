package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Guru Login page POM
public class Guru99Login {
WebDriver driver;
By userGuru99Name = By.name("uid");
By passWordGuru99 = By.name("password");
By titleText = By.className("barone");
By login = By.name("btnLogin");

public  Guru99Login(WebDriver driver)
{
	this.driver = driver;
}

public void setUserName(String strUserName)//set user name in text box
{
	driver.findElement(userGuru99Name).sendKeys(strUserName);
}

public void setPassWord(String strPassWord)//set password in text box
{
	driver.findElement(passWordGuru99).sendKeys(strPassWord);
	
}

public void clickLogin()//click on login button
{
	driver.findElement(login).click();
}

public String getLoginTitle()//get the title of login page
{
	return driver.findElement(titleText).getText();
	
}

/*

 * This POM method will be exposed in test case to login in the application

 * @param strUserName

 * @param strPasword

 * @return

 */

public void loginToGuru99(String strUserName, String strPassWord)
{
	this.setUserName(strUserName);//fill the user name
    this.setPassWord(strPassWord);//fill the password
    this.clickLogin();//click on login button

}
}
