package test3;

public class ClassA {
int a=10;
int b=20;
public void add()
{
	System.out.println(a+b);
}
public static void main(String[] args)
{
	ClassA obA = new ClassA();
	System.out.println(obA.b);
	obA.add();
}
}
