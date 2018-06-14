package test1package;

import org.testng.annotations.Test;

public class Class4 
{
  @Test
  public void testCase1() 
  {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test Case1 Successful " + "Thread Count is " + id);
	  
  }
  @Test
  public void testCase2() 
  {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test Case2 Successful " + "Thread Count is " + id);
	  
  }
  @Test
  public void testCase3() 
  {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test Case3 Successful " + "Thread Count is " + id);
	  
  }
  @Test
  public void testCase4() 
  {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test Case4 Successful " + "Thread Count is " + id);
	  
  }
}

