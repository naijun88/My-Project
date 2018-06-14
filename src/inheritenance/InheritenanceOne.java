package inheritenance;

public class InheritenanceOne {
static int a = 2, b = 3;//declare static variable.

//declare non-static variable, Non-static class members only can be Inherited.
//if delcare non-static variable inside of method, we need parameter while define a method
int c = 5, d = 6;

//create a static method with returning a value
public static int add(int a, int b)
{
	int result = a+b;
	return result;
}

//create a static method without returning a value
public static void mul(int a, int b)
{
	System.out.println(a*b);
}

//create a non-static method with returning a value
public int add2()//if declare non-static variable inside of method you can use parameter
{
	int res = c+d;
	return res;
}

//create non-static method without returning a value
public void mul2()//if declare non-static variable inside of method you can use parameter
{
	System.out.println(c*d);
}

public static void main(String[] args)
{
	//Access static class member(Using class name)
	int x = InheritenanceOne.add(a, b);
	System.out.println(x);
	InheritenanceOne.mul(a, b);//without return type no need system.out.println method
	
	//Access non static class member(Using object)
	InheritenanceOne br = new InheritenanceOne();
	int y = br.add2();
	System.out.println(y);
	br.mul2();
}
}
