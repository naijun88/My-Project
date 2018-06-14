package Method;

import java.util.Scanner;

public class MethodWithoutReturn {
public void studentRank(int score)//with invoking object
{
	if(score >=600)
		System.out.println("Rank A");
	else if(score <= 500)
		System.out.println("Rank B");
	else
		System.out.println("Rank C");
}
public static void main(String[] args)
{
	MethodWithoutReturn nr = new MethodWithoutReturn();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your num: ");
	int num = in.nextInt();
	nr.studentRank(num);


	}
}

//without invoking object
/*public static void studentRank(int score)
{
	if(score >=600)
		System.out.println("Rank A");
	else if(score <= 500)
		System.out.println("Rank B");
	else
		System.out.println("Rank C");
}
public static void main(String[] args)
{
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your num: ");
	int num = in.nextInt();
	studentRank(num);


}*/
