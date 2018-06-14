package Algorithms;

import java.util.Scanner;

public class SumOfNaturalNum {
public static void main(String[] args){
//while loop
int total=0, count=1, num=10;
while(count<=num)
{
	total += count;
	count++;
}
System.out.println(total);


//for loop
int total1=0, num1=10;
for(int count1=1; count1<=num1; count1++)
{
	total1 += count1;
}
System.out.println(total1);


//user enter
int total2=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number: ");
int num2 = in.nextInt();
for(int count2=1; count2<=num2; count2++)
{
	total2 += count2;
}
System.out.println(total2);
}
}
/*int total = 0;
for(int i=1; i<=10; i++)
{
	total += i;
}System.out.println(total);*/
	
/*int total1 = 0;
int i=1;
while(i<=10)
{

	total1 += i;
	i++;
}
System.out.println(total1);*/

/*int total2 = 0;
int i = 1;
do{
	total2 += i;
	i++;
}while(i<=10);
System.out.println(total2);*/
