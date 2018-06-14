




package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

For example:

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=0, index2=1        */

public class twoSum
{
	public static int[] twoSum(int[] numbers, int target) 
	{
        int[] indexes = new int[2];
        
        if(numbers == null || numbers.length < 2)
        {
            return indexes;
        }
        
        HashMap<Integer, Integer> secondNumber = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < numbers.length; i++)
        {
            int numberNeeded = target-numbers[i];
            if(!secondNumber.containsKey(numbers[i]))
            {
                secondNumber.put(numberNeeded, i);
            }
            else
            {
                indexes[0] = secondNumber.get(numbers[i]) + 1;
                indexes[1] = i + 1;
                break;
            }
        }
        
        return indexes;
    }
	/*
	public static void main(String[] args)
	{
		
		twoSum nr = new twoSum();
		int[] numbers = {1, 3, 6, 8};
		int target = 4;
		nr.twoSum(numbers, target);
		nr.display();
				
	}
	
	public void display(int index)
	{
	
		int[] numbers = {1, 3, 6, 8};
		for(int i=0; i < numbers.length; i ++)
			System.out.print(i + " ");
	}*/
	
	
		
	
}