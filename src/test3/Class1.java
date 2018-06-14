package test3;

public class Class1 
{
	private String name = "Test Automation";
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}


	public static void main(String[] args)
	{
		Class1 obj = new Class1();
		System.out.println(obj.getName());
	}

}

