package Algorithms;

import java.util.Scanner;
public class reverseStringBuffer {
	public static String Reverse1(String a){
		String reverse = "";
		int len = a.length();
	    	for (int i = len - 1 ; i >= 0 ; i-- )
	        reverse += a.charAt(i);
	    	return reverse;
	}
	public static StringBuffer Reverse2(String a){
		StringBuffer sb = new StringBuffer(a);
		return sb.reverse();
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String original = in.nextLine();
        System.out.println("Reverse of entered string is: "+Reverse1(original));
        System.out.println("Reverse of entered string is: "+Reverse2(original));
        in.close();
	}
}
