package Algorithms;

import java.util.Arrays;

public class SortStringAlph {
// Method to sort a string alphabetically
public static String sortString(String inputstr)
{
	// convert input string to char array
	char[] chinput = inputstr.toCharArray();
	//sort inputstr
	Arrays.sort(chinput);
	// return new sorted string
	return new String(chinput);
}
public static void main(String[] args)
{
	String inputstr = "geeksforgeeks";
	String outputstr = sortString(inputstr);
	System.out.println("Input String: "+inputstr);
	System.out.println("Output String: "+outputstr);
	
}
}
