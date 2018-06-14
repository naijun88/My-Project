package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSequence {
	
@Test
public void testCase1()
{
	System.out.println("This is the test case1");
}

@Test
public void testCase2()
{
	System.out.println("This is the test case2");
}

@BeforeMethod
public void beforeMethod()
{
	System.out.println("This will execute before every Method");
}

@AfterMethod
public void afterMethod()
{
	System.out.println("This will execute after every Method");
}

@BeforeClass
public void beforeClass()
{
	System.out.println("This will execute before the class");
}

@AfterClass
public void afterClass()
{
	System.out.println("This will execute after the class");
}

@BeforeTest
public void beforeTest()
{
	System.out.println("This will execute before the test");
}

@AfterTest
public void afterTest()
{
	System.out.println("This will execute after the test");
}

@BeforeSuite
public void beforeSuite()
{
	System.out.println("This will execute before the test suite");
}

@AfterSuite
public void afterSuite()
{
	System.out.println("This will execute after the test suite");
}


}

/*It is clearly visible that the @Suite annotation is the very first and the very lastly executed. 
Then @Test followed by @Class. Now if you notice, the @Method has executed twice. 
As @Test is a method in the class, hence @Method will always executed for each @Test method.
*/
