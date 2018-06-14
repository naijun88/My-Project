package inheritenance;

public class ClassChild extends ClassParent{
public void myMethod()
{
	System.out.println("UFT for Test Automation");
}

public static void main(String[] args)
{
	ClassChild nr1 = new ClassChild();
	nr1.myMethod();
	
	ClassParent nr = new ClassParent();
	nr.myMethod();
	
}
}
