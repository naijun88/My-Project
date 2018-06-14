package Algorithms;

import java.util.Scanner;

public class CountOccurence {
public static void main(String[] args)
{
	int count=0;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of element");
	int n = in.nextInt();
	int[] a = new int[n];
	System.out.println("Enter the number of element");
	for(int i=0; i<n; i++)
	{
		a[i]=in.nextInt();
	}
	System.out.println("Enter the digit you want to count the occurence: ");
	int x = in.nextInt();
	for(int i=0; i<n; i++)
	{
		if(a[i]==x)
		{
			count++;
		}
	}
	System.out.println("Number of Occurrence of the Element:"+count);
}
}
