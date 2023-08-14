package com.prowings.constructorchaining;

public class Student extends Person{

	int roll;
	String name;
	
	public Student()
	{
		super(10,10,10);
//		this.roll = 40;
//		this.name = "AAAA";
	}
	
	public Student(int rn, String nm)
	{
		this(rn, nm, 6, 67, 30);
		this.roll = rn;
		this.name = nm;
		
	}
	
	public Student(int roll, String name, int height, int weight, int age)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.roll = roll;
	}
	
	
}
