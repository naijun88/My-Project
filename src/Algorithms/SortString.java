package Algorithms;

import java.util.Arrays;

public class SortString {
//sort list of String with Java Collection.
public static void main(String[] args)
{
	String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
			"aug", "Sep", "Oct", "nov", "Dec" };
	
	// Display input un-sorted list.
	System.out.println("-------Input List-------");
	showList(inputList);
	
	// Call to sort the input list.
	Arrays.sort(inputList);
	
	// Display the sorted list.
	System.out.println("\n-------Sorted List-------");
	showList(inputList);
	
	// Call to sort the input list in case-sensitive order.
	System.out.println("\n-------Sorted list (Case-Sensitive)-------");
	Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
	
	// Display the sorted list.
	showList(inputList);
}
public static void showList(String[] arr)
{
	for(String str : arr)
		System.out.print(str+" ");
	System.out.println();
}
}
