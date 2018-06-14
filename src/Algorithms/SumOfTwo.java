package Algorithms;

import java.util.Scanner;

public class SumOfTwo {
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number1: ");
	int num1 = in.nextInt();
	System.out.println("Enter the number2: ");
	int num2 = in.nextInt();
	System.out.println("Enter the number3: ");
	int num3 = in.nextInt();
	System.out.println("The result is: " + sumOfTwo(num1, num2, num3));
}

public static boolean sumOfTwo(int p, int q, int r)
{
	return ((p+q)==r);
}
}
//5, 10, 15 true
