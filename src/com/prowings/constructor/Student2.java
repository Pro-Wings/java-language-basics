package com.prowings.constructor;

public class Student2 {
	
	
	int roll;
	String name;
	String address1;
	String address2;
	
	public Student2()
	{
		
	}

	public Student2(int roll, String name, String address1, String address2)
	{
		this.roll = roll;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
	} 
	
	public static void main(String[] args) {
		
		Student2 s = new Student2();
		
		Student2 s1 = new Student2(10, "Ram", "Pune", "Kolhapur");
		
		Student2 s2 = new Student2(20, "Sham", "Mumbai", "Pune");
		
		Student2 s3 = new Student2(30, "Sandeep", "Latur", "Mumbai");

		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address1);
		System.out.println(s2.address2);

		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address1);
		System.out.println(s1.address2);
		
		System.out.println(s3.roll);
		System.out.println(s3.name);
		System.out.println(s3.address1);
		System.out.println(s3.address2);

	}

}
