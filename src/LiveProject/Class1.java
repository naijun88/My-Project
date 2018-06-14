package LiveProject;

public class Class1 
{
	//Declare Static variables
	static int a = 10, b = 20;
	//Declare Non-Static variables
	int c = 30, d = 40;
	//Create Static methods with returning a value
	public static int add()
	{
		int result = a + b;
		return result;
	}
	
	//Create Static methods without returning a value
	public static void multiply()
	{
		System.out.println(a*b);
	}
	//Create Non-static methods with returning a value
	public int add2()
	{
		int res = c + d;
		return res;
	}
	//Create Non-static methods without returning a value
	public void multiply2()
	{
		System.out.println(c*d);
	}

	public static void main(String[] args)
	{
		//Access static class members(Using class name)
		int x = Class1.add();
		System.out.println(x);//30
		System.out.println(Class1.a);//10
		
	    Class1.multiply();//200
	    
	    //Access Non Static class members (using Object)
	    Class1 obj = new Class1();
	    int y = obj.add2();
	    System.out.println(y);// 70
	    System.out.println(obj.c);//30
	    obj.multiply2();
	    
	}
	
	
	

}
