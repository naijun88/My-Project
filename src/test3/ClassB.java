package test3;

public class ClassB extends ClassA{
//int a=100, b=200;
public void add()
{
	System.out.println(a+b);
}
public static void main(String[] args)
{
	ClassB obB = new ClassB();
	System.out.println(obB.b);
	obB.add();

}
}
//result is 200 and 300 if we do add int a=100, b=200 