



package Algorithms;

public class Sum1000Prime {
/*A number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11). 
The thumb rule – Every number is divisible by 1 and won’t be divisible by any number greater
than n/2. Take the opposite route to identify if the number is prime, i.e. try dividing the 
number by 2, 3, 4…until n/2. If it is divisible, mark it as not prime – else if the loop ends, 
it is a prime number. At last, keep adding all the prime numbers from 1 to 1000.*/

public static void main(String[] args)
{
	int number=2;
	int count = 0;
	long sum = 0;
	while(count < 1000)//Write a program to find the sum of the first 1000 prime numbers.
	{
		if(prime(number))
		{
			sum += number;
			count++;
		}
		number++;
	}
	System.out.println(sum);
	

}
public static boolean prime(int num)
{
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
			return false;
	}
	return true;
		
}
}


//3682913
//or
/*public static void main(String[] args)

{
	int num=2;
	long sum = 0;
	for(int i=2; i<1000; i++)
	{
		if(prime(num))
		{
			sum += num;
			
		}
		
		num++;
	}
	System.out.println(sum);
}*/
