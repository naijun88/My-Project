package Algorithms;

public class PalinDromeStringArray {
public static boolean PalinDrom(int[] arr)
{
	int n = arr.length;
	for(int i=0; i<n; i++)
	{
		int start = arr[i];// get the element from the start
		int end = arr[--n];// get corresponding element from end
		// check if elements till the middle have been compared
		if(n<i)
			return true;
		else if(start!=end)
			return false;
	}
	return true;
	
}
public static void main(String[] args)
{
	int[] arr = {4, 5, 6};
	if(PalinDrom(arr)==true)
	{
		System.out.println("Array is a palindrome");	
	}
	else
	{
		System.out.println("Array is Not a palindrome");	
	}
}
}
