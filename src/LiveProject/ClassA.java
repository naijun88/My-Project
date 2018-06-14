package LiveProject;

public class ClassA 
{
	int a = 10;
	int b = 20;
	public void add()
	{
		System.out.println(a+b);
	}

	public static void main(String [] args)
	{
		ClassA objA = new ClassA();
		System.out.println(objA.a);//10
		objA.add();//30
		
	}
}
