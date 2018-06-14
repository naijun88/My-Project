package Algorithms;

public class Swap {
/*The general way to swap two numbers is to use a temporary variable to hold value of either one. 
But this program asks us specifically to swap two numbers without using a temporary variable. 
How? Again, it’s a simple mathematics trick.
		A = 10, B = 20;
		A = A + B, i.e. A = 30
		B = A – B, i.e. 30 – 20 = 10
		A = A – B, i.e. 30 – 10 = 20
		Finally A = 20, B = 10. Simple right?*/
public static void main(String[] args)
{
	int x=10;
	int y=20;
	System.out.println("Before Sawp: ");
	System.out.println("x value: " +x);
	System.out.println("y value: "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After swap:");
	System.out.println("x value: "+x);
	System.out.println("y value: "+y);
}
}
