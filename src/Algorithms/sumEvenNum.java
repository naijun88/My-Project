


package Algorithms;

public class sumEvenNum  //even is 2, 4, 6, 8.....偶数， odd is 1, 3, 5, 7, 9.....奇数
{
	public static void main(String[] args)
	{
		int sum = 0;
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2==0)
				sum += arr[i];	
		}
		System.out.println(sum);
		

	}
}
