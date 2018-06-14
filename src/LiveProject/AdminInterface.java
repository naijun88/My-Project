package LiveProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminInterface 
{
	public static WebDriver driver;
	public void launchApplication()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
	}
	public void closeApplication()
	{
		driver.close();
	}
	public void adminLogin(String Username, String Password)
	{
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.id("tdb1")).click();
	}
	public void addManufacturer(String Name)
	{
		driver.findElement(By.linkText("Manufacturers")).click();
		driver.findElement(By.linkText("Insert")).click();
		driver.findElement(By.name("manufacturers_name")).sendKeys(Name);
		driver.findElement(By.id("tdb1")).click();
	}
	
	public void addCategory(String Name)
	{
		driver.findElement(By.linkText("Categories/Products")).click();
		driver.findElement(By.className("ui-button-text")).click();
		driver.findElement(By.name("categories_name[1]")).sendKeys(Name);
		driver.findElement(By.id("tdb3")).click();
	}
	
	public void addProduct(String Name)
	{
		driver.findElement(By.linkText("Categories/Products")).click();
		driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[8]/td/table/tbody/tr/td[2]/span[2]/a/span[2]")).click();
		boolean statusButon = driver.findElement(By.xpath("html/body/div[2]/form/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input[1]")).isSelected();
		driver.findElement(By.xpath("html/body/div[2]/form/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input[1]")).click();
		
		driver.findElement(By.id("products_date_available")).click();
		WebElement dateBox = driver.findElement(By.id("products_date_available"));
		dateBox.click();
		driver.findElement(By.xpath("html/body/div[4]/div/a[2]/span")).click();
		driver.findElement(By.xpath("html/body/div[4]/table/tbody/tr[3]/td[4]/a")).click();
		
		
		Select dropDown = new Select(driver.findElement(By.name("manufacturers_id")));
		dropDown.selectByValue("2112");
		
		driver.findElement(By.name("products_name[1]")).click();
		driver.findElement(By.name("products_name[1]")).sendKeys(Name);
		
		Select dropDown1 = new Select(driver.findElement(By.name("products_tax_class_id")));
		dropDown1.selectByIndex(1);
		
		driver.findElement(By.name("products_price")).click();
		driver.findElement(By.name("products_price")).sendKeys("8");
		
		driver.findElement(By.name("products_price_gross")).click();
		driver.findElement(By.name("products_price_gross")).sendKeys("8.8");
		
		driver.findElement(By.name("products_description[1]")).click();
		driver.findElement(By.name("products_description[1]")).sendKeys("Cute hello cat for kids.");
		
		driver.findElement(By.name("products_quantity")).click();
		driver.findElement(By.name("products_quantity")).sendKeys("100");
		
		driver.findElement(By.name("products_model")).click();
		driver.findElement(By.name("products_model")).sendKeys("V1009");
		
		WebElement Browse = driver.findElement(By.name("products_image"));
	    Browse.sendKeys("/Users/shimeiblanco/Downloads/helloCat.jpg");
	  
	    driver.findElement(By.name("products_url[1]")).sendKeys("www.helloCar.com");
	    driver.findElement(By.name("products_weight")).sendKeys("20");
	    
	    driver.findElement(By.id("tdb1")).click();
	    
	}
	
	public void addCurrency(String Name)
	{
		driver.findElement(By.linkText("Localization")).click();
	    driver.findElement(By.linkText("Currencies")).click();
		driver.findElement(By.className("ui-button-text")).click();
		
		driver.findElement(By.name("title")).sendKeys(Name);
		driver.findElement(By.name("code")).sendKeys("JPY");
		driver.findElement(By.name("value")).sendKeys("6");
		driver.findElement(By.id("tdb1")).click();
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		AdminInterface obj = new AdminInterface();
	
		
		//Test Case 1: Verify "Launch Application(gcrShop Web portal Admin Interface)" using valid URL
		obj.launchApplication();
		boolean Username = driver.findElement(By.name("username")).isDisplayed();
		boolean Password = driver.findElement(By.name("password")).isDisplayed();
		boolean Login = driver.findElement(By.id("tdb1")).isDisplayed();
		if (Username == true && Password == true && Login == true)
		{
			System.out.println("Test Case 1: " + "Username, Password, Login Elements Exit - Passed");
		}
		else
		{
			System.out.println("Test Case 1: " + "Username, Password, Login Elements Not Exit - Failed");
		}
		obj.closeApplication();
		
		//Test Case 2: Verify "Admin Login" in gcrShop Web portal Admin Interface with valid inputs
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Test Case 2: "+"Admin Login Successful - Passed");
		}
		else
		{
			System.out.println("Test Case 2: "+"Admin Loin unsuccessful - Failed");
		}
		obj.closeApplication();
		
		//Test Case 3: Verify "Important/Required Elements availability" in gcrShop Web portal Admin Interface
		//index page (after login)
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		boolean Manufacturers= driver.findElement(By.linkText("Manufacturers")).isDisplayed();
		boolean CatanProduct= driver.findElement(By.linkText("Categories/Products")).isDisplayed();
		
		if (Manufacturers == true && CatanProduct == true)
		{
			System.out.println("Test Case 3: "+"Manufacturers, Categories, Products Elements available - Passed");
		}
		else
		{
			System.out.println("Test Case 3: "+"Manufacturers, Categories, Products Elements Not available - Failed");
		}
		obj.closeApplication();

		//Test Case 4: Verify "Add Manufacturer" in gcrShop Web portal Admin Interface index page.
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		obj.addManufacturer("Lily2");
		String Man_count = driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[22]/td/table/tbody/tr/td[1]/strong[3]")).getText();
		int Manf_count = Integer.parseInt(Man_count);
		if (Manf_count == 1073)
		{
			System.out.println("Test Case 4: "+"Manufacturer Added - Passed");
		}
		else
		{
			System.out.println("Test Case 4: "+"Manufacturer Added - Failed");
		}
		obj.closeApplication();
		
		//Test Case 5: Verify "Add Category" in gcrShop Web portal Admin Interface index page.
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		obj.addCategory("LilyBand2");
		Thread.sleep(15000);
		// every iteria run this should add 1 row in the expression of xpath
		String text = driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[8]/td/table/tbody/tr/td[1]")).getText();
	    
		
		if (text.contains("Categories: 2"))
		{
			System.out.println("Test Case 5: "+"Category Added - Passed");
		}
		else
		{
			System.out.println("Test Case 5: "+"Category Added - Failed");
		} 
		obj.closeApplication();
		
		//Test Case 6: Verify "Add Product" in gcrShop Web portal Admin Interface index page.
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		obj.addProduct("HelloCat");
		String text1 = driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[9]/td/table/tbody/tr/td[1]")).getText();
		if (text1.contains("Products: 5"))
		{
			System.out.println("Test Case 6: "+"Products Added - Passed");
		}
		else
		{
			System.out.println("Test Case 6: "+"Products Added - Failed");
		} 
		obj.closeApplication();
		
		//Test Case 7: Verify "Add Currency" in gcrShop Web portal Admin Interface index page
		obj.launchApplication();
		obj.adminLogin("admin", "admin@123");
		obj.addCurrency("Japanese Yen");
		
		String cun_count = driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[22]/td/table/tbody/tr[1]/td[1]/strong[3]")).getText();
		int cun_count_new = Integer.parseInt(cun_count);
		if (cun_count_new == 75)
		{
			System.out.println("Test Case 7: "+"Currency Added - Passed");
		}
		else
		{
			System.out.println("Test Case 7: "+"Currency Added - Failed");
		}
		obj.closeApplication();
		
		
		
		
		
		
		
		
		

	}

}
