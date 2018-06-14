package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*Write a program to find out duplicate or repeated characters in a
string, and calculate the count of repetition.*/
public class FindDuplicateOfString {
public void findDuplicateChars(String str)
{
	//We use HashMap and Set to find the duplicate characters in a string
	//We then create one HashMap with Character as a key and it’s number of occurrences as a value
	HashMap<Character, Integer> dupMap = new HashMap<Character, Integer>();
	//we convert the given string to char array
	char[] chrs = str.toCharArray();
	 //checking each char of strArray
	for(Character ch:chrs)
			if(dupMap.containsKey(ch))
				 //If char is present in charCountMap, incrementing it's count by 1
				dupMap.put(ch, dupMap.get(ch)+1);
			else
				//If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
				dupMap.put(ch, 1);
	
	//Getting a Set containing all keys of charCountMap
	Set<Character> keys = dupMap.keySet();
	//Iterating through Set 'charsInString'
	for(Character ch:keys)
		//If any char has a count of more than 1, printing it's count
		if(dupMap.get(ch)>1)
		{
			System.out.println(ch+"---->"+dupMap.get(ch));
		}
}	
public static void main(String[] args)
{
	FindDuplicateOfString dcs = new FindDuplicateOfString();
	dcs.findDuplicateChars("Java2Novice");
	
}
			
}

