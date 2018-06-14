package Algorithms;

import java.util.Scanner;

public class Palindrome {
public static boolean isPalindrom(int number)
{
	int reverse = 0;
	while(number!=0)
	{
		reverse = reverse*10 + number/10;
		number = number/10;
		if(number==reverse)
			return true;
	}
	return false;
	
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	if(isPalindrom(number))
	{
		System.out.println("Number : " + number + " is a palindrome");	
	}
	else
	{
		System.out.println("Number : " + number+ " is not a palindrome");	
	}
}
}
