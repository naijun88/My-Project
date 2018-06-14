package LiveProject;

public class heroHonda extends Bike
{

	@Override
	public void engine() {
		System.out.println("Bikes have Engine");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bikes have wheels");
		
	}
	
	public static void main(String[] args) 
	{
		//create object
		heroHonda objHH = new heroHonda();
		objHH.engine();
		objHH.seat();
		objHH.wheels();
		objHH.handle();
		

	}

}
