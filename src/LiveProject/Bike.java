package LiveProject;

public abstract class Bike 
{

	public void handle() //Concrete Methods
	{
		System.out.println("Bikes have handle");
	}
	
	public void seat() //Concrete Methods
	{
		System.out.println("Bikes have seats");
	}
	
	public abstract void engine(); // abstract method
	public abstract void wheels(); //abstract method
	
	
	
	public static void main(String[] args) 
	{
		heroHonda obj = new heroHonda();
		obj.engine();
		obj.wheels();
	  

	}

}
