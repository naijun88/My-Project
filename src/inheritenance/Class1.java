package inheritenance;

public class Class1 {
protected int a = 10, b = 20;

protected void add()
{
	System.out.println(a+b);
}

public static void main(String[] args)
{
	Class1 nr = new Class1();
	System.out.println(nr.b);
	nr.add();
}
}
