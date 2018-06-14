package test3;
import javax.swing.plaf.synth.SynthStyle;

public class ClassNew implements Interface1{
@Override
public void engine1()
{
	System.out.println("Bikes have Engine");
}
@Override
public void wheels1()
{
	System.out.println("Bikes have wheels");
}
@Override
public void seat1()
{
	System.out.println("Bikes have seats");
}
@Override
public void handle1()
{
	System.out.println("Bikes have handle1");
}
public static void main(String[] args)
{
	ClassNew nb = new ClassNew();
	nb.engine1();
	nb.handle1();
	nb.seat1();
	nb.wheels1();
			
}

	
}

