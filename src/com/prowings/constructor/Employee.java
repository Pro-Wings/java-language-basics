package com.prowings.constructor;

public class Employee {
	
	int id;
	String name;
	String department;
	
	public Employee() //no-arg
	{
		
	}
	public Employee(int id) //parameterized - 1 arg
	{
		this.id = id;
	}
	
	public Employee(int id, String department) //parameterized - 2 arg
	{
		this.id = id;
		this.department = department;
	}

	public Employee(int id, String name, String department) //parameterized - 3 arg
	{
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.id = 10;
		e1.name = "Ram";
		e1.department = "IT";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.department);
		
		Employee e2 = new Employee();
		e2.id = 20;
		e2.name = "Sham";
		e2.department = "Accounts";

		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.department);


		Employee e3 = new Employee(40);

		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.department);
		
		Employee e4 = new Employee(50, "HR");

		System.out.println(e4.id);
		System.out.println(e4.name);
		System.out.println(e4.department);


	}

}
