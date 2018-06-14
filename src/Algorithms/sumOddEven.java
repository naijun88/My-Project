package Algorithms;


// sum of the even numbers and odd numbers in the array
public class sumOddEven 
{
	public static void main (String[] arg)
	{
		int sumE = 0, sumO = 0;
		int[] a = {1, 2, 4, 5, 6, 7, 8, 9};
		for(int i = 0; i <a.length; i++)
		{
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
