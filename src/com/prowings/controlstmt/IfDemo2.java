package com.prowings.controlstmt;

public class IfDemo2 {

	public static void main(String[] args) {


		int i = 10;

		if (isEven(i)) 
		System.out.println("Even");
		else
		System.out.println("Not Even!!");


	}
	
	
	public static boolean isEven(int num)
	{
//		if(num % 2 == 0)
//			return true;
//		else
//			return false;
		
		return (num % 2 == 0) ? true : false;
		
	}

}


