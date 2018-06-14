



package Algorithms;

public class reverseMulti
{
	public static String reverse(String a)//reverse string of word to word in one sentence
	{
		String[] words = a.split(" ");
		String reverse = "";
		for(int i = 0; i < words.length; i ++)
		{
			String word = words[i];
			String reverseWord = "";
			for(int j = word.length()-1; j >= 0; j--)
			{
				reverseWord += word.charAt(j);
			}
			reverse += reverseWord + " ";
		}
		return reverse;
	}
	public static String reverse1(String a)
	{
		String[] words = a.split(" ");// reverse words sequence in one sentence use split method
		String reverse1 = "";
		for( int i = words.length-1; i >= 0; i --)
		{
			reverse1 += words[i] + " ";
		}
		return reverse1;
	}
	
	public static String reverse2(String a)
	{
		String reverse2 = "";// reverse string in one sentence
		for( int i = a.length()-1; i >= 0; i --)
		{
			reverse2 += a.charAt(i);
		}
		return reverse2;
	}
	
	public static int reverse3(int number)
	{
		int reverse3 = 0;// reverse a number 
		while (number != 0)
		{
			reverse3 = (reverse3*10) + (number%10);
			number = number/10;
		}
		return reverse3;
	}
	public static void main(String[] args)
	{
		String s = "He feel good";
		System.out.println(reverse(s));
		System.out.println(reverse1(s));
		System.out.println(reverse2(s));
		System.out.println(reverse3(12345678));
	}
	

}
