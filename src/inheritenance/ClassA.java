package inheritenance;

public class ClassA {
int a = 10, b = 20;
public void add()
{
	System.out.println(a+b);
}

public static void main(String[] args)
{
	ClassA objA = new ClassA();
	System.out.println(objA.a);//using object to access non static member
	objA.add();//using object to call method without using system.out.println function.
}
}
