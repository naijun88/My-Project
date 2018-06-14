package test3;

public class Inheritance {
//Declare static variables
static int a=10, b=20;
//Declare non-static variable
int c=30, d=40;

//Create static method with returning a value
public static int add()
{
	int result = a+b;
	return result;
}

//Create static method without returning a value
public static void mul()
{
	System.out.println(a*b);
}

//Create Non-static method with returning a value
public int add2()
{
	int result = c+d;
	return result;
}

//Create Nonstatic method without returning a value
public void mul2()
{
	System.out.println(c*d);
}

//main method
public static void main(String[] args)
{
	//Access static class members(Using class name)
	int x = Inheritance.add();
	System.out.println(x);
	System.out.println(Inheritance.a);
	Inheritance.mul();
	
	//Access non static class member(Using object)
	Inheritance nr = new Inheritance();
	int y = nr.add2();
	System.out.println(y);
	System.out.println(nr.c);
	nr.mul2();
}
	
}
