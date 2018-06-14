package accesslink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Internationalisation {
public static void main(String[] args)
{
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("intl.accept_languages", "jp");
	WebDriver driver = new FirefoxDriver(profile);
	driver.get("https://www.google.com");//// will open google in Japanese Lang
	
	
	
}
}
