package Algorithms;

public class StringValueOf {
public static void main(String[] args)
{
/*The java string valueOf() method converts different types of values into string. 
By the help of string valueOf() method, you can convert int to string, long to string, 
boolean to string, character to string, float to string, double to string, object to 
string and char array to string.*/
//1.convert int to string
int value = 10;
String s1 = String.valueOf(value);
System.out.println(s1+80);


//2. covert one char to String
char c = 'A';
String s2 = String.valueOf(c);
System.out.println(s2);

//or
char c1 = 'B';
String s3 = Character.toString(c1);
System.out.println(s3);

//3. covert char array to String
char[] ch = {'i', 'y', 'o'};
String str = new String(ch);
System.out.println(str);
//or 
//String str = String.valueOf(ch);

//4. convert String to char
String str4 = "Hello";

for(int i=0; i<str4.length(); i++)
{
	char ch4 = str4.charAt(i);
	System.out.println("Character at "+i+" Position: "+ch4);
}
}
}
