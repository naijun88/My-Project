package Aggregation;

public class College {
String coll_name;
Address a;
College(String name, Address adr)
{
	this.coll_name = name;
	this.a = adr;
}

public static void main(String[] args)
{
	Address ad = new Address(19, "tre", "et","China");
	College obj = new College("Liaoning", ad);
	System.out.println(obj.coll_name);
	System.out.println(obj.a.street_no);
	System.out.println(obj.a.city);
	System.out.println(obj.a.state);
	System.out.println(obj.a.country);
}
}
