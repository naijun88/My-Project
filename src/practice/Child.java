package practice;

public class Child{
public String course = "Math";
public static void main(String[] args)
{
	Parent nr = new Parent();
	nr.setcareer("teacher");
	nr.setcollege("RTU");
	System.out.println(nr.getcareer());
	System.out.println(nr.getcollege());
	nr.dis();
	
}
}
