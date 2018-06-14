package accesslink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SecuritySocketLayer {
public static void main(String[] args)
{
	//FireFox - This connection is untrusted
	ProfilesIni pro = new ProfilesIni();
	FirefoxProfile profile = pro.getProfile("myprofile");
	profile.setAcceptUntrustedCertificates(true);
	profile.setAssumeUntrustedCertificateIssuer(false);
	WebDriver driver = new FirefoxDriver();
	
	//Google Chrome -This site security is not trusted
	DesiredCapabilities handle = DesiredCapabilities.chrome();
	handle.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	WebDriver driver1 = new ChromeDriver(handle);
	
	//Internet Explorer ( IE) - This security certificate 
	//presented by this website was not trusted by a trusted certificate authority (CA)
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
	WebDriver driver3 = new InternetExplorerDriver(capabilities);
	
	
}
}
