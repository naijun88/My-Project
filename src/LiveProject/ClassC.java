package LiveProject;

/*//multiply level inheritance, we can inherit Class A too.
public class ClassC extends ClassB 
{
	public static void main(String[] args)
	{
		ClassC	objC = new ClassC();
		System.out.println(objC.a);//100, 10 if extends ClassA
		objC.add();//300, 30 if extends ClassA
		
	}

}*/

public class ClassC extends ClassB 
{
		int a = 1;
		int b = 2;
		public void add()
		{
			System.out.println(a+b);
		}
		public static void main(String[] args)
		{
			ClassC objC = new ClassC();
			System.out.println(objC.a);
			objC.add();
		}
	

}


