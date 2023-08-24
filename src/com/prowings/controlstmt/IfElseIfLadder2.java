package com.prowings.controlstmt;

public class IfElseIfLadder2 {

	public static void main(String[] args) {

		
		int marks = 118;
		
		if((marks >= 50) && (marks <= 60))
		{
			System.out.println("C Grade");
		}
		else if((marks >= 61)&&(marks <= 70))
		{
			System.out.println("B Grade");
		}
		else if((marks >= 71)&&(marks <= 100))
		{
			System.out.println("A Grade");
		}
		else
		{
			System.out.println("Invalid Marks!!");
		}
		

	}
	
	

}


