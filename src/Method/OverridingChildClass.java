package Method;

public class OverridingChildClass extends OverridingParentClass {
public void eat()
{
	System.out.println("Boy is eating");//Box extends Human
}

public static void main(String[] args)
{
	OverridingChildClass nr = new OverridingChildClass();
	 //This will call the child class version of eat()
	nr.eat();
	OverridingParentClass nr1 = new OverridingParentClass();
	nr1.eat();
}
}
