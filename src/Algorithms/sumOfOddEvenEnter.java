package Algorithms;

import java.util.Scanner;

//sum of the even numbers and odd numbers in the array entered by user
public class sumOfOddEvenEnter 
{
	public static void main (String[] arg)
	{
		int sumE = 0, sumO = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers of elements in array: ");
		int n = s.nextInt();
        //defines an array that has space to hold n int,  creating an object with type int[]
		//So int[] is actually a class
		int[] a = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n;i++)
		{
			a[i] = s.nextInt();
			if (a[i]%2==0)
			{
				sumE = sumE + a[i];
			}
			else
			{
				sumO = sumO + a[i];
			}
			
		}
		System.out.println("Sum of even numbers: " + sumE);
		System.out.println("Sum of Odd numbers: " + sumO);
		
		
	}


}
