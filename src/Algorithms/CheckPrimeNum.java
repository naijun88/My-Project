package Algorithms;

import java.util.Scanner;

public class CheckPrimeNum {
/*A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other 
than 1 and itself. A natural number greater than 1 that is not a prime number is called a composite 
number. For example, 5 is prime because 1 and 5 are its only positive integer factors,
whereas 6 is composite because it has the divisors 2 and 3 in addition to 1 and 6.

The logic: Run a loop from 2 till n/2 and return false in case the input is divisible by any of the iterator.*/
public static boolean PrimeNumber(int number)
{
	for(int i=2; i<=number/2; i++)
	{
		if(number%i==0)
		{
			return false;
		}
	}
	return true;
}

public static void main(String[] args)
{
	System.out.println("Is 17 prime number? "+PrimeNumber(17));
	System.out.println("Is 19 prime number? "+PrimeNumber(19));
	System.out.println("Is 15 prime number? "+PrimeNumber(15));
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = in.nextInt();
	System.out.println(PrimeNumber(num));
	
}
}
