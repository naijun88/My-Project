package Algorithms;

import java.util.Arrays;
//Kth Largest Element in an Array (Java)
/*Find the kth largest element in an unsorted array. 
 Note that it is the kth largest element in the sorted order, not the kth distinct element.
 For example, given [3,2,1,5,6,4] and k = 2, return 5.
 Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
*/
public class LargestNum 
{
	public int findKthLargest(int[] nums, int k)
	{
	    Arrays.sort(nums);
	    return nums[nums.length-k];
	}
	
	public static void main(String[] args)
	{
		int arr[] = {0, 1, 3, 5, 7, 9};
		LargestNum nr = new LargestNum();
		System.out.println(nr.findKthLargest(arr, 1)); // k = 1(largest), k =2(second largest) or k =3 
		
	}

}
