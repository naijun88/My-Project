package Algorithms;


//sum of the numbers in the array
public class sumOfNum 
{
	public static void main(String[] args)
	{
		int sumNum = 0;
		int[] a = {2, 5, 7, 9, 10, 20, 406, 708};
		for (int i = 0; i < a.length; i++)
		{
			sumNum = sumNum + a[i];
		}
		System.out.println("Sum of the numbers in the list is: " + sumNum);
		
	}

}


