package test3;

public class Test1 {
public static void studentRank(int mark)
{
	if(mark>=600)
		System.out.println("Rank A");
	else if(mark>=500)
		System.out.println("Rank B");
	else if(mark>=400)
		System.out.println("Rank C");
	else
		System.out.println("Rank D");	   
	
}
public static void main(String[] args)
{
	studentRank(450);
	
}
}
