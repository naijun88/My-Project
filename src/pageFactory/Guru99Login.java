	package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login {
//All WebElements are identified by @FindBy annotation
WebDriver driver;
@FindBy(name = "uid")//webElement are identify by @FindBy annotation
WebElement guru99UserName;

@FindBy(name = "password")
WebElement guru99PassWord;

@FindBy(className = "barone")
WebElement titleText;

@FindBy(name = "btnlogin")
WebElement  loginButton;

public Guru99Login(WebDriver driver)
{
	this.driver = driver;
	//this initElement method will create all WebElement.
	PageFactory.initElements(driver, this);//static initElement method of pageFactory class for initializing webElement
}

public void setUserName(String strUserName)
{
	guru99UserName.sendKeys(strUserName);
}
public void setPassWord(String strPassWord)
{
	guru99PassWord.sendKeys(strPassWord);
}

public void loginClick()
{
	loginButton.click();
}

public String getTitleText()
{
	return titleText.getText();
}

public void loginToGuru99(String strUserName, String strPassWord)
{
	this.setUserName(strUserName);
	this.setPassWord(strPassWord);
	this.loginClick();
}

}
