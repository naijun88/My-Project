package Algorithms;

public class reverseANumber {
	 
	public int reverse(int number)
	{		
		int reverse = 0;//in the while loop, must initialization first, then while syntax.
		while(number != 0)
		{
		reverse = (reverse*10)+(number%10);
		number = number/10;
		} 
		return reverse;
	}
	
	public static void main(String[] args){
		reverseANumber nr = new reverseANumber();
		System.out.println("Result: "+nr.reverse(107));
		
		
		
	}
}

/*This particular algorithm takes me back to school days. How will you reverse a number? 
 Or rather how will you extract the last digit of a particular number? Simple, keep the 
 remainder after diving it by 10. Now that you have extracted the last digit, what’s next? 
 Yeah! Remove the last digit and iterate until you get to the first digit. 
 And how do you remove the last digit keeping all other digits as-is? 
 Yeah! Divide the number by 10 to get an integer value.*/


//Second method use static
/*public class reverseANumber {
	 
	public static int reverse(int number) // add static
	{		
		int reverse = 0;//in the while loop, must initialization first, then while syntax.
		while(number != 0)
		{
		reverse = (reverse*10)+(number%10);
		number = number/10;
		} 
		return reverse;
	}
	
	public static void main(String[] args)
	{
		System.out.println(revrese(5678));
		
		
		
	}
}*/
