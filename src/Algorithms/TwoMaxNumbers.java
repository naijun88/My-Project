

package Algorithms;

public class TwoMaxNumbers {
/*Out of a given array of numbers, identify the two maximum numbers. 
Initially let’s take the maxOne & maxTwo as 0. Now iterate through the array comparing the 
current element’s value first with maxOne and then with maxTwo.
If its greater than maxOne, copy maxOne to maxTwo and element to maxOne.
If its greater than maxTwo, copy the element to maxTwo
If it is not greater than either maxOne & maxTwo, move on.*/

public static void main(String[] args)
{
	int[] num = {5,34,78,2,45,1,99,23};
	int maxOne=0;
	int maxTwo=0;
	for(int n:num)
	{
		if(maxOne<n)
		{
			maxTwo=maxOne;
			maxOne=n;
			
		}
		else if(maxTwo<n)
		{
			maxTwo=n;
		}
	}
	System.out.println("First Max Number: "+maxOne);
	System.out.println("Second Max Number: "+maxTwo);
    System.out.println("The difference is: " + (maxOne-maxTwo));
}
}

//or
/*for(int i=0; i<nums.length; i++)
{
	if(max1<nums[i])
	{
		max2=max1;
		max1=nums[i];
	}
	else if(max2<nums[i])
		max2=i;
}*/
