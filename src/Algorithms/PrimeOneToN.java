package Algorithms;

import java.util.Scanner;

public class PrimeOneToN {
//return the prime number from 1 to 100
public static boolean prime(int a)
{
	for(int i=2; i<=a/2; i++)
	{
		if(a%i==0)
		{
			return false;
		}
	}
	return true;
}
public static void main(String[] args)
{
	int a = 2;
	for(int i=1; i<20; i++)
	{
		if(prime(a)==true)
			System.out.println(a);
		a++;
		
	}
}

}
/*public static boolean prime(int num)
{
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
			return false;
	}
	return true;

	
}
public static void main(String[] args)
{
	for(int i=2; i<=500; i++)
	{
		if(prime(i))
		{
			System.out.print(i+ " ");
		}
		
	}
*/

/*Scanner in = new Scanner(System.in);
System.out.println("Enter: ");
int n = in.nextInt();
for(int i=2; i<n; i++)
{
	if(prime(i))
	{
		System.out.print(i+ " ");
	}
}*/