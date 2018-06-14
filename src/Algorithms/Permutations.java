package Algorithms;

import java.util.Arrays;

public class Permutations {
public boolean checkAnagram(String str1, String str2) {

	   if (str1.length() != str2.length())
	     return false;

	   char[] a = str1.toCharArray();
	   char[] b = str2.toCharArray();

	   Arrays.sort(a);
	   Arrays.sort(b);

	   return Arrays.equals(a, b);
	}

}
