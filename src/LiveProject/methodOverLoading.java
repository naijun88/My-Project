package LiveProject;

public class methodOverLoading 
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public void add(double a, double b)
	{
		System.out.println(a+b);
	}
	public void add(double a, double b, double c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args)
	{
		methodOverLoading obj = new methodOverLoading();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(1.234, 2.456);
		obj.add(1.234, 2.456, 3.567);
		
	}

}
