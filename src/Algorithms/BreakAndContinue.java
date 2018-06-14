
package Algorithms;

public class BreakAndContinue {
public static void main(String[] args)
{
	//break: the loop break instantly
	for(int i=0; i<10; i++)
	{
		System.out.print(i);
		if(i==4)
			break;
	}
	
	
	
	for(int j=0; j<10; j++)
	{
		System.out.println("\nIn loop " + j);
		if(j==4)
		{
			continue;
		}
		System.out.println("This will not print when j is 4");		
	}
}
}
