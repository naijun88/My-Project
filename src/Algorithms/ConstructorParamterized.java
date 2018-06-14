package Algorithms;

public class ConstructorParamterized {
int empId;
String empName;
//parameterized constructor with two parameters
ConstructorParamterized(int id, String name)
{
	this.empId = id;
	this.empName = name;
}

void info()
{
	System.out.println("Id: "+empId+" Name: "+empName);
}

public static void main(String[] args)
{
	ConstructorParamterized nr1 = new ConstructorParamterized(10245, "Chaitanya");
	ConstructorParamterized nr2 = new ConstructorParamterized(9888, "lukyyyy");
	nr1.info();
	nr2.info();
}
}
