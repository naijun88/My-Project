package Algorithms;

public class BubbleSortDesc {
public static void bubble(int[] arr)
{
	int n = arr.length;
	for(int i=n-1-1; i>=0; i--)
	{
		for(int j=n-i-2; j>=0; j--)
		{
			if(arr[j]<arr[j+1])
			{
				int temp =arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
						
			}
		}
	}
}
public static void main(String[] args)
{
	int[] arr = {56, 45, 89, 34, 1, 6, 9, 10};
	bubble(arr);
	for(int i : arr)
		System.out.print(i+" ");
}
}

