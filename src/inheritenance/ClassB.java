package inheritenance;

public class ClassB extends ClassA {
int a = 100, b = 200;
public void add()
{
	System.out.println(a+b);
}
public static void main(String[] args)
{
	ClassB objB = new ClassB();
	System.out.println(objB.b);
	objB.add();
}
}
/*ClassB is child(sub) class, ClassA(super) is parents class
Class B has highest priority, classA has lower priority.
If in this code, no int a and int b variables, no add method,
the result should be 10 and 30 that inherited from ClassA*/