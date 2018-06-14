
package Algorithms;

public class ReFindDupElementOfArray {
//Java Program To Find Duplicate Elements In An Array Using Brute Force Method :
public static void main(String[] args){
String[] arr= {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
for(int i=0; i<arr.length-1; i++)
{
	for(int j=i+1; j<arr.length; j++)
	{
		if((arr[i].equals(arr[j])) && (i != j))
		{
			System.out.println("Duplicate Element is : "+arr[j]);
		}
	}
}
}
}
//To find a duplicate number in a array
/*int[] arr= {1, 2, 2, 3, 4, 5, 6};
for(int i=0; i<arr.length-1;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if((arr[i]==arr[j])&&(i!=j))
			System.out.println("Duplicate Element is : "+arr[j]);
	}*/
	
