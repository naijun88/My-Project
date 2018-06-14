package Algorithms;

public class BreakLoop {
public static void main(String[] args)
{
	//while
	int i=0;
	while(i<10)
	{
		i++;
		System.out.print(i+" ");
		if(i==3)
			break;
	}
	
	//do while
	System.out.println("\n");
	int j=0;
	do{
		j++;
		System.out.print(j+" ");
		if(j==3)
			break;
	}while(j<10);
	
	//for loop
	System.out.println("\n");
	for(int k=0; k<10; k++)
	{
		
		System.out.print(k+" ");
		if(k==3)
			break;	
	}
	
}
}
