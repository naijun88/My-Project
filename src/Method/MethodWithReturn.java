package Method;

public class MethodWithReturn {
//with invoking object
public int mul(int a, int b, int c)
{
	int result = a*b*c;
	return result;	
}

public static void main(String[] args)
{
	int a =2, b = 3, c = 5;
	MethodWithReturn nr = new MethodWithReturn();
	System.out.println(nr.mul(a, b, c));
}
}

//without invoking object
/*public static int mul(int a, int b, int c)
{
	int result = a*b*c;
	return result;	
}

public static void main(String[] args)
{
	int a =2, b = 3, c = 5;
	System.out.println(mul(a, b, c));
}*/
