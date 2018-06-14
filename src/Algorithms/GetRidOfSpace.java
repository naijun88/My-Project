package Algorithms;

public class GetRidOfSpace {
	public static String remove(String str)
	{
		String remove = "";
	    String[] words = str.split(" ");
		for(int i=0; i<words.length; i++)
		{
			remove += words[i];
		}
		return remove;
	}
	public static void main(String[] args)
	{
		
		String str = "We are very happy";
	    System.out.println(remove(str));
	}
}
