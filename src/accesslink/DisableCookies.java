package accesslink;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DisableCookies {
public static void main(String[] args) throws Exception
{
	FirefoxProfile profile = new ProfilesIni().getProfile("default");
	profile.setPreference("network.cookie.cookieBehavior", 2);
	WebDriver driver = new FirefoxDriver(profile);
		
}
}
