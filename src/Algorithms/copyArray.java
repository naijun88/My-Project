package Algorithms;
//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
/*Parameters
src − This is the source array.

srcPos − This is the starting position in the source array.

dest − This is the destination array.

destPos − This is the starting position in the destination data.

length − This is the number of array elements to be copied.

Return Value
This method does not return any value.*/
public class copyArray 
{
	 public static void main(String[] args) 
	   {

	      int arr1[] = { 0, 1, 2, 3, 4, 5 };
	      int arr2[] = { 5, 10, 20, 30, 40, 50 };
	    
	      // copies an array from the specified source array
	      System.arraycopy(arr1, 1, arr2, 0, 3);
	      System.out.print("array2 = ");
	      System.out.print(arr2[0] + " ");
	      System.out.print(arr2[1] + " ");
	      System.out.print(arr2[2] + " ");
	      System.out.print(arr2[3] + " ");
	      System.out.print(arr2[4] + " ");
	      System.out.print(arr2[5] + " ");
	      //or as below
	      //System.out.println(array2[0] + " " + array2[1] + 

	   }
	/* public static void main(String[] args)
	 {
	 	int[] arr1 = {1, 2, 3, 4};
	 	int[] arr2 = {5, 6, 7, 8};
	 	System.arraycopy(arr1, 0, arr2, 1, 2);
	 	System.out.print("Arr2 = ");
	 	selfTest nr = new selfTest();
	 	nr.dispaly(arr2);
	 	
	 	
	 }
	 public void dispaly(int[] arr2)
	 {
	 	for(int i : arr2)
	 		System.out.print(i + " ");
	 }*/
}
