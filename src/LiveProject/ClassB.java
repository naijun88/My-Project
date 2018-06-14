package LiveProject;

public class ClassB extends ClassA
{
	int a = 100;
	int b = 200;
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		ClassB objB = new ClassB();
		objB.add();//300
		System.out.println(objB.a);//100
		
	}

}

