package Aggregation;

public class Student {
int roll_num;
String stud_name;
Address asr;//create a HAS-A relationship;
Student(int no, String name, Address stud_adr)
{
	this.roll_num = no;
	this.stud_name = name;
	this.asr = stud_adr;
}

public static void main(String[] args){
Address a = new Address(18, "Lucky Street", "PA", "USA");
Student obj = new Student(1, "Rechard", a);
System.out.println(obj.roll_num);
System.out.println(obj.stud_name);
System.out.println(obj.asr.street_no);
System.out.println(obj.asr.city);
System.out.println(obj.asr.state);
System.out.println(obj.asr.country);
}
}
