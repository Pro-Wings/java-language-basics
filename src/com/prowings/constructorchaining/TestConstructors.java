package com.prowings.constructorchaining;

public class TestConstructors {
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 10;
		s.height = 3;
		s.weight = 30;
		s.roll = 7;
		s.name = "Ram";
		
		System.out.println(s.age);
		System.out.println(s.height);
		System.out.println(s.weight);
		System.out.println(s.roll);
		System.out.println(s.name);
		
		Student s2 = new Student();

		System.out.println(s2.age);
		System.out.println(s2.height);
		System.out.println(s2.weight);
		System.out.println(s2.roll);
		System.out.println(s2.name);
		
		
		Student s3 = new Student(10, "Ram", 5, 56, 23);
		
		System.out.println(s3.age);
		System.out.println(s3.height);
		System.out.println(s3.weight);
		System.out.println(s3.roll);
		System.out.println(s3.name);
		
	}

	

}
