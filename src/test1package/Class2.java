package test1package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 
{
	@BeforeClass
	  public void login()
	  {
		  System.out.println("Login Successfully");
	  }
	  @AfterClass
	  public void logout()
	  {
		  System.out.println("Logout Successfully");
	  }
	@Test(priority = 1)
	public void deleteVendor()
	{
	    System.out.println("Delete Vendor Successfully");
	}
	@Test(priority = 2)
	public void deleteProduct()
	{
		System.out.println("Delete Product Successfully");
	}
	@Test(priority = 3)
	public void deleteCurrency()
	{
		System.out.println("Delete Currency Successfully");
	}
	
}
