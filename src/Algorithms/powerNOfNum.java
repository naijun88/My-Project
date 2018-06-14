package Algorithms;

import java.util.Scanner;

//Write a Java program to calculate power ‘n’ of a number
//for example: 2 power 5 = 2 * 2 * 2 * 2 * 2 = 32

public class powerNOfNum 
{
	public static int Power(int x,int n)
	{
		if(n==0) return 1;
		else if(n==1) return x;
		else
		{
			return x*Power(x,n-1);
		}
	}
	public static void main(String args[])
	{
		int x,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
        x = in.nextInt();
        System.out.println("Enter the power: ");
        n = in.nextInt();
        System.out.println("Number "+x+" to the power "+n+" is: "+Power(x,n));
        in.close();
	}	

}
