




package Algorithms;

//Write a Java program to print the Fibonacci series

import java.util.Scanner;
public class Fibonacci 
{
	public static int Fib(int a)
	{
		return (a<=1) ? a : Fib(a-1)+Fib(a-2);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
                System.out.println("Enter a number: ");
                int n = in.nextInt();
                for(int i=0;i<=n-1;i++)
                System.out.print(Fib(i)+" ");
                in.close();
	}
}

// my method
/*public class selfTest 
{
	public static int Fib(int a)
	{
		if (a <= 1)
		{
			return a;
		}
		else
		{
			return Fib(a-1) + Fib(a-2);
		}
	}
	
	public static void main(String[] args)
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = in.nextInt();
		for(int i = 1; i <= n; i++)
		System.out.print(Fib(i)+" ");
	}
		
}

	*/