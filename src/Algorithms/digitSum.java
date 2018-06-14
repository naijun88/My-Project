package Algorithms;

/*You’re given an integer N. Write a Java program to calculate the sum of all the digits of N. 
In mathematics, the digit sum of a given integer is the sum of all its digits 
(e.g. the digit sum of 84001 is calculated as 8+4+0+0+1 = 13).*/

import java.util.Scanner;

public class digitSum
{
	public static int sum(int n)// static no need require object
	
	{
        return n==0 ? 0 : n%10+sum(n/10);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Sum of digits of "+num + " is: " + sum(num));
    }

}

/*
 int sum = 0;
	while(num!=0)
	{
		sum += num%10;
		num = num/10;
	}
	return sum;
 */

/*public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your number: ");
	int num = in.nextInt();
    selfTest nr = new selfTest();
    int result = nr.sum(num);
    System.out.println(result);

}

public int sum(int num)//without static require object
{
	int sum = 0;
	while(num!=0)
	{
		sum += num%10;
		num = num/10;
	}
	return sum;

}*/

