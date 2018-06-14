package Algorithms;

import java.util.Scanner;

public class IdentifyOddEven 
{
	public static void main (String[] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number you want to check even or odd: ");
		int n = in.nextInt();
		{
			if (n%2==0)
			{
				System.out.println(n + " is even number.");
			}
			else
			{
				System.out.println(n + " is odd number.");
			}
			
		}
		
		
		
	}


}
