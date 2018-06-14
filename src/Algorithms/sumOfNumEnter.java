package Algorithms;

import java.util.Scanner;


//sum of the numbers in the array entered by user
public class sumOfNumEnter 
{
	public static void main(String[] args)
	{
		int sumNum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements numbers in the array: ");
		int n = in.nextInt();
		int[] b = new int[n]; //create a new array object, n is number of elements.
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < n; i++)
		{
			b[i] = in.nextInt();
			sumNum += b[i];
		}
		System.out.println("Sum of the numbers in the list is: " + sumNum);
	}
	
	

}
