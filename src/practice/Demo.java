package practice;

public class Demo extends Math{
public int sum(int n1, int n2)
{
	return n1+n2;
}
public int sum(int n1, int n2, int n3)
{
	return n1+n2+n3;
}
public static void main(String[] args)
{
	Math nr = new Demo();
	System.out.println(nr.sum(5, 10));
	System.out.println(nr.sum(5, 10, 15));
	nr.dis();
	
}
}
