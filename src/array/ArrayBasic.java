

package array;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args)
	{
		int[] arr1 = {0, 1, 2, 4};
		System.out.println(arr1.length);

		String [] array1 = {"Selenium", "UFT", "LoadRunner", "RFT"};
        for(String i: array1)
        	System.out.print(i+" ");
		String str = Arrays.toString(array1);
		System.out.println("\n"+str);
		
		boolean a = Arrays.asList(array1).contains("UFT");
		boolean b = Arrays.asList(array1).contains("Selenium");
		System.out.println(a);
		System.out.println(b);
	}
}
