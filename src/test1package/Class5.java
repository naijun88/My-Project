package test1package;

import org.testng.annotations.Test;

public class Class5 
{
	 @Test
	  public void testCase5() 
	  {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test Case5 Successful " + "Thread Count is " + id);
		  
	  }
	  @Test
	  public void testCase6() 
	  {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test Case6 Successful " + "Thread Count is " + id);
		  
	  }
	  @Test
	  public void testCase7() 
	  {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test Case7 Successful " + "Thread Count is " + id);
		  
	  }
	  @Test
	  public void testCase8() 
	  {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test Case8 Successful " + "Thread Count is " + id);
		  
	  }
	 

}
