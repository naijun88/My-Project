package Algorithms;

public class Enhancedloop {
public static void main(String[] args)
{
	//1
		String[] language = {"C", "COBOL", "JAVA"};
		for(String lang : language)
			System.out.println(lang + " ");
		
		
		//2
		String[] language1 = new String[3];
		language1[0] = "C";
		language1[1] = "COBOL";
		language1[2] = "JAVA";
		
		for(String lang : language1)
			System.out.println(lang);
		
		//3
		int[] matchOperation = new int[3];
		int a=10, b=20;
		matchOperation[0] = a+b;
		matchOperation[1] = a-b;
		matchOperation [2] = a*b;
		for(int i : matchOperation)
			System.out.println(i);
		
		//4
		double[] matchOperation1 = new double[4];
		double a1=20, b1=30;
		matchOperation1[0] = a+b;
		matchOperation1[1] = a-b;
		matchOperation1[2] = a*b;
		matchOperation1[3] = a/b;
		for(double i : matchOperation1)
			System.out.println(i);
				
}
}
