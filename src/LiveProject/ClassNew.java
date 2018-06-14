package LiveProject;
import javax.swing.plaf.synth.SynthStyle;

public class ClassNew implements Interface1
{

	@Override
	public void engine() {
		System.out.println("Bikes have Engine");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bikes have wheels");
		
	}

	@Override
	public void seat() {
		System.out.println("Bikes have Engine");
		
	}

	@Override
	public void handle() {
		System.out.println("Bikes have handle");
		
	}
	
	public static void main(String[] args)
	{
		ClassNew obj = new ClassNew();
		obj.seat();
		obj.wheels();
		obj.engine();
		obj.handle();
	}
	
	
}
