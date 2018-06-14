package Method;

public class ExternalMethodWithObjClass2 {
public int add(int a, int b, int c)
{
	int result = a+b+c;
	return result;
}

public static void main(String[] args)
{
	//create obj1
	ExternalMethodWithObjClass2 obj1 = new ExternalMethodWithObjClass2();
	int a = 3, b = 5, c = 8;
	//Calling Internal method
	System.out.println(obj1.add(a, b, c));
	
	//create obj2
	ExternalMethodWithObjClass1 obj2 = new ExternalMethodWithObjClass1();
	//Calling External method
	System.out.println(obj2.mul(a, b, c));
}
}
