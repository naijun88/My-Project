package Algorithms;

import java.util.Arrays;

public class selfTest{	
public static String[] reverse(String[] arr)
{
	String[] reverse = new String[arr.length];
	for(int i=arr.length-1; i>=0; i--)
	{
		for(String s : reverse)
			System.out.println(s+" ");
	}
	return reverse;
}
public static void main(String[] args)
{
	String[] arr = {"ABC", "BCD", "DER"};
	for(int i=arr.length-1; i>=0; i--)
	{
		System.out.print(arr[i]+" ");
	}
	
	
}
}

 


