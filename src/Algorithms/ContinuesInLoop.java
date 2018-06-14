package Algorithms;

public class ContinuesInLoop {
	public static void main(String[] args)
	{
		//continue in for loop
		int i=0;
		while(i<10)
		{
			i++;
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	    System.out.println("\n");
	    
	    //continue in while loop
		int j = 0;
		do{
			j++;
			if(j==3)
				continue;
			
			System.out.print(j + " ");
		}while(j<10);
		
		System.out.println("\n");
		
		//continue in do while loop
		for(int k=0; k<10; k++)
		{
			if(k==3)
				continue;
			System.out.print(k+" ");
		}
		
	}
}
