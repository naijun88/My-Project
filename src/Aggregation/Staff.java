package Aggregation;

public class Staff {
String emp_name;
Address emp_address;
Staff(String name, Address adr)
{
	this.emp_name = name;
	this.emp_address = adr;
}

public static void main(String[] args)
{
	Address ads  = new Address(15, "ds", "yt", "India");
	Staff st = new Staff("YAYA", ads);
	System.out.println(st.emp_name);
	System.out.println(st.emp_address.street_no);
	System.out.println(st.emp_address.city);
	System.out.println(st.emp_address.state);
	System.out.println(st.emp_address.country);
	
	
}
}
