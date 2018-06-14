package Method;

public class ExternalMethodWithOutObjClass1 {
public static void studentRank(int score)
{
	if(score>=600)
		System.out.println("Rank A");
	else if(score>=500)
		System.out.println("Rank B");
	else
		System.out.println("Rank C");
}

public static void main(String[] args)
{
	//Calling method without object
	studentRank(600);
}
}
