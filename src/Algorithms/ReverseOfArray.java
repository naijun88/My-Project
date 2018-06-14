package Algorithms;

import java.util.Scanner;

public class ReverseOfArray {
public static void main(String[] args)
{
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter number of element: ");
	 int n = in.nextInt();
	 int[] b = new int[n];
	 System.out.println("Enter the elements one by one: ");
	 for(int i=0; i<n; i++)
	 {
		  b[i] = in.nextInt();
	 }
	 for(int i=n-1; i>=0; i--)
	 {
		 System.out.print(
				 b[i]+" ");
	 }
				
			
		 
}
}

