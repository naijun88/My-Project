package Algorithms;

public class SwapWithTemporaryVariable {
public static void main(String[] args)
{
	int x=10;
	int y=20;
	System.out.println("Before Swapping");
	System.out.println("Value of x is :" + x);
	System.out.println("Value of y is :" + y);
	//swap the value
	swap(x, y);
}

public static void swap(int x, int y)
{
	int temp = x;
	x=y;
	y=temp;
	System.out.println("After Swaping: ");
	System.out.println("x value is :"+x);
	System.out.println("y value is :"+y);

}
}
