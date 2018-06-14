package Algorithms;

public class FindUpperCaseLetter {
public static void main(String[] args)
{
	String in = "Happyeveryday";
	int n = in.length();
	for(int i=0; i<n; i++)
	{
		if(Character.isUpperCase(in.charAt(i)))
		{
			System.out.println("The uppercase characters are " + in.charAt(i));
		}
	}
	
}
}
