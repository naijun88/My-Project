package Algorithms;

public class linearSearch 
{
	 // This function returns index of element x in arr[]
    public static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++)
        {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }
 
        // return -1 if the element is not found
        return -1;
    }
    
    public static void main(String[] args)
    {
    	int[] arr = {1, 3, 4, 6, 8, 9, 10, 12, 56};
    	int n = arr.length;
    	int x = 10;
    	System.out.println(search(arr, n, 10));//return 6 index of "10"
    	
    	// or public int search(remove static from the method declaration)
    	linearSearch ob = new linearSearch();
    	int[] arr1 = {1, 3, 4, 6, 8, 9, 11, 12, 56};
    	int n1 = arr.length;
    	int x1 = 10;
    	System.out.println(ob.search(arr, n, 11));//return -1 since "10" is not found.
    	
    }
    
    

}
