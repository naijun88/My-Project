package Algorithms;

public class PrimeSumOneToN {
public static boolean prime(int a)
{
	for(int i=2; i<=a/2; i++)
	{
		if(a%i==0)
			return false;
	}
	return true;
}

public static void main(String[] args)
{
	int sum = 0;
	int a = 2;
	for(int i=1; i<1000; i++)
	{
		if(prime(a)==true)
		{
			sum += a;
		}
		a++;		
	}
	System.out.println(sum);
	
}
}
