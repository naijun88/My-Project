package Algorithms;

public class SplitString {
	public static void main(String[] args) throws Exception
	{
		//split int number
		String string = "004-034556";
		String[] parts = string.split("-");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556
		System.out.println(part1);
		System.out.println(part2);
		
		
		//split string
		String str = "We are good";
		String[] words = str.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		
		
		
	}
}
