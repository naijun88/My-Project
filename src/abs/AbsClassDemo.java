package abs;

//Regular class extends abstract class
public class AbsClassDemo extends AbsClassSum {
public int sumOfTwo(int num1, int num2)
{
	return num1+num2;
}

public int sumOfThree(int num1, int num2, int num3)
{
	return num1+num2+num3;
}

public static void main(String[] args)
{
	AbsClassSum obj = new AbsClassDemo();
	System.out.println(obj.sumOfTwo(3, 7));
	System.out.println(obj.sumOfThree(4, 3, 19));
	obj.disp();
}

}
