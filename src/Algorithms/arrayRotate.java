package Algorithms;
//We have to rotate the elements of the given array k times to the right. n = 7, k =3;
//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//Intermediate Array
//create a new array and then copy elements to the new array. 
//Then change the original array by using System.arraycopy().
public class arrayRotate 
{
    public int[] rotateArray(int array[], int k) 
    {

        int[] newArray = new int[array.length];// or int newArray[] = new int[array.length]
        for (int i = 0; i < array.length; i++) 
        {
            newArray[(i + k) % array.length] = array[i];
        }
        System.arraycopy(newArray, 0, array, 0, array.length);
        return newArray;

    }

    
    public static void main(String[] args) 
    {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        arrayRotate rotate = new arrayRotate();
        // below or rotate.display(rotate.rotateArray(array, 3));//display is a method
        //rotate.display(array);
        //rotate.rotateArray(array, 3);
        rotate.rotateArray(array, 3);
        for(int i : array)
        	System.out.print(i+" ");
        
       

    }
    
    
    
    //call display method directly
   /* public void display(int[] array) //enhanced for loop: execute all elements in array.
    {
    	for(int i : array)
		{
			System.out.print(i + " ");
		}

    }*/
}


//or
/*public static void main(String[] args) 
{
    int array[] = { 1, 2, 3, 4, 5, 6, 7 };
    arrayRotate rotate = new arrayRotate();
    rotate.rotateArray(array, 3);
    for (int i=0; i < array.length; i++)
        System.out.print(array[i] + " ");

}*/