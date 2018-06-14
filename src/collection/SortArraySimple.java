package collection;

import java.util.Arrays;

public class SortArraySimple {
	public static void main(String[] args)
	{
		String[] arr = {"e", "f", "b", "c", "d", "a"};
		System.out.println("Before sorting:");
		for(String b : arr)
			System.out.print(b+" ");
		System.out.println(" ");
		//or System.out.println("\n");
		
		Arrays.sort(arr);
		System.out.println("After sorting: ");
		for(String s : arr)
			System.out.print(s+" ");

	}
}
