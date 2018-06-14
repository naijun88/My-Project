package abs;

public class XYZ extends ABC{
public void walk()
{
	
	System.out.println("Boy walks");
}
public static void main(String[] args)
{
	ABC obj = new XYZ();
	obj.walk();
	
	ABC obj1 = new ABC();
	obj1.walk();
		
}

}
