package Algorithms;

public class SubstringInString 
{
	public static void main(String[] args)
	{
		String str = "HelloWordVivek";
		String ptr = "";
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i+1; j <= str.length(); j++)
			{
				ptr = str.substring(i, j);//i is beginIndex, j is endIndex
				System.out.println(ptr);
			}
		}
			
		
	}

}
