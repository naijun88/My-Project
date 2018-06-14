package Algorithms;

import java.util.Scanner;
public class Factorial 
{
	public static int Factorial1(int a)
	{
		return (a==0 || a==1) ? 1 : (a*Factorial1(a-1));	
	}
	public static void main(String args[])
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = in.nextInt();
		System.out.println("Factorial of "+n+" is: "+Factorial1(n));
		in.close();
	}
}


//my way
/*public static int Factorial1(int a)
{
	if (a == 0 || a == 1)
	{
		return 1;
	}
	else
	{
		return(a*Factorial1(a-1));
	}

}

public static void main(String[] args)
{
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = in.nextInt();
	System.out.println("Factorial of " + n + " is: " + Factorial1(n));
}*/