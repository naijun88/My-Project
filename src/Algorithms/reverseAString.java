package Algorithms;

public class reverseAString 
{
	public static String Reverse(String a) //if remove static, we should create a new object for class
	{
		String reverse = ""; 
		int len = a.length();
	    for (int i = len -1 ; i >= 0 ; i--) //length is 15, but i is from 0 to 14
	    {  
	    	reverse += a.charAt(i);
	    }
	    return reverse;
	}
	
	public static void main(String args[])
	{
		String s1 = "This is awesome";
		String s2 = "This is not good";
		//System.out.println(s.length());
        System.out.println(Reverse(s1));// if no static, create a object for class, i.e nr.reverse(int x)
		System.out.println(Reverse(s2));
	}

	
}
