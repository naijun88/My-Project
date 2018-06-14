package Algorithms;

public class Constructor {
String name;
//This is constructor/.
Constructor()
{
	this.name = "I am studying Java.";
}

public static void main(String[] args)
{
	Constructor nr = new Constructor();
    System.out.println(nr.name);
}
}

//3 type constructor - 1. no argument constructor
/*public class selfTest{
public selfTest()
{
	System.out.println("This is no argument constructor.");
}

public static void main(String[] args){
new selfTest();
}
}*/

//3 type constructor - 2. default constructor
/*public class selfTest{
public static void main(String[] args){
selfTest nr = new selfTest();
}*/
//---->
/*If you do not implement any constructor in your class, Java compiler inserts a default constructor 
into your code on your behalf. This constructor is known as default constructor. You would not find 
it in your source code(the java file) as it would be inserted into the code during compilation and 
exists in .class file. */
/*public class selfTest{
selfTest()
{}
public static void main(String[] args){
selfTest nr = new selfTest();
*/

//3 type constructor - 3. parameterized constructor see deditation clss file

