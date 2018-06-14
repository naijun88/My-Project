package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ReFindDuplicate{ 
/*An array is given with a range of numbers between 1 to N, where one of the numbers is repeated. 
You need to write a program to find out the duplicate number.
The logic: Ideally the sum of 1 to N numbers is n*(n+1)/2. Since one of the number is repeated, 
calculate the actual sum and minus it from the ideal sum to get the duplicate number.*/
public int duplicate(List<Integer> numbers)
{
	int n=numbers.size()-1;
	System.out.println(n);
	int total = getSum(numbers);
	int dup = total - (n*(n+1)/2);
	return dup;
}

public int getSum(List<Integer> numbers)
{
	int sum = 0;
    for(int num : numbers)
    {
        sum += num;
    }
    return sum;
}

public static void main(String a[]){
    List<Integer> numbers = new ArrayList<Integer>();
    for(int i=1;i<30;i++){
        numbers.add(i);
    }
    
    //add duplicate number into the list
    
    numbers.add(22);
    ReFindDuplicate dn = new ReFindDuplicate();
    System.out.println("Duplicate Number: "+dn.duplicate(numbers));
}
}