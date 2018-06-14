package Algorithms;

import java.util.Arrays;
import java.util.List;

public class printIndex 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("zero", "one", "two", "three");
		int index=0;
		for(String s : list)
		System.out.println((index++)+": "+s);
		
	}

}
