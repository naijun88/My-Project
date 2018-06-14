package test3;

public class ClassC extends ClassB{
//int a=2, b=5;
public void add()
{
	System.out.println(a+b);
}
public static void main(String[] args)
{
	ClassC obC = new ClassC();
	System.out.println(obC.a);
	obC.add();
}
}
//if we do not add a=2, b=5, the result should be 200, 300
//if the in the ClassB, we do not add a=100, b=200, thr result should be 20, 30
