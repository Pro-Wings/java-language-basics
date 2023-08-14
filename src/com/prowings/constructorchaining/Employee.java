package com.prowings.constructorchaining;

public class Employee {
	
	int id;
	String name;
	String dept;
	
	public Employee()
	{
		
		this(10);
		
	}
	public Employee(int id)
	{
		this(id, "Ram");
	}

	public Employee(int id, String name)
	{
		this(id, name, "IT");
		
	}

	public Employee(int id, String name, String dept)
	{
		this.id= id;
		this.name = name;
		this.dept = dept;
		
	}

	
}
