


package Algorithms;

public class MetrixTrangle {
public static void main(String[] args)
{
	final int base_size = 8;
	for(int row=0; row<base_size; row++)
	{
		for(int col=0; col<(row+1); col++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	final int base_size1 = 6;
	for(int row1=0; row1<base_size1; row1++)
	{
		for(int col1=0; col1<row1; col1++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}
		
	
}
}
