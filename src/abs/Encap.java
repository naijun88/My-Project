package abs;

public class Encap {
private int emp_ssn;
private String emp_name;
private int emp_age;
public int getSSN()
{
	return emp_ssn;
}

public String getName()
{
	return emp_name;
}
public int getAge()
{
	return emp_age;
}

public void setSSN(int empssn)
{
	emp_ssn = empssn;
}
public void setName(String name)
{
	emp_name = name;
}

public void setAge(int age)
{
	emp_age = age;
}
}
