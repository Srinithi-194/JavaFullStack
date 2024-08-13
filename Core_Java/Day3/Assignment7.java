package com.sri;
class Person__
{
	void getFirstName(String fname)
	{
		System.out.println(fname);
	}
	void getLastName(String lname)
	{
		System.out.println(lname);
	}
}
class Employee__ extends Person__
{
	void getFirstName(String fname)
	{
		System.out.println(fname);
	}
	void getLastName(String jtitle)
	{
		System.out.println(jtitle);
	}
}

public class Assignment7 {

	public static void main(String[] args) {
		Person__ p=new Person__();
		p.getFirstName("Vishal");
		p.getLastName("Kumar");
		Employee__ e=new Employee__();
		e.getLastName("Software Developer");

	}

}
