package com.prowings.constructor;

public class Student {
	
	
	int roll;
	String name;
	String address;
	
	public static void main(String[] args) {

		Student s1 = new Student();
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address);
		
		s1.roll = 10;
		s1.name = "Ram";
		s1.address = "Pune";

		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address);
		
		Student s2 = new Student();
		
		s2.roll = 20;
		s2.name = "Sham";
		s2.address = "Mumbai";
		
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address);
		
		Student s3 = new Student();
		
		s3.roll = 30;
		s3.name = "Sandeep";
		s3.address = "Latur";
		
		System.out.println(s3.roll);
		System.out.println(s3.name);
		System.out.println(s3.address);
		

	}

}
