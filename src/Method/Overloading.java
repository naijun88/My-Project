package Method;

//Method overloading increases the readability of the program.
public class Overloading {
public void disp(char c)
{
	System.out.println(c);
}
//overloading method: when two or more methods in one class have the same name but different parameters
public void disp(char c, int num)
{
	System.out.println(c+ " " + num);
}

public static void main(String[] args)
{
	Overloading nr = new Overloading();
	nr.disp('a');
	nr.disp('b', 8);
}
}
//Method Overloading: changing no. of arguments
/*In this example, we have created two methods, first add() method performs addition of two numbers 
and second add method performs addition of three numbers.

In this example, we are creating static methods so that we don't need to create instance for 
calling methods.*/

