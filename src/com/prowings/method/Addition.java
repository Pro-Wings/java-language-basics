package com.prowings.method;

import java.io.IOException;

public class Addition {
	
	int roll;
	static String schoolName;
	
	public  void sum(int a, int b)
	{
		int result = a + b;
		System.out.println("Addition result is : "+result);
	}

	public void substract(int a, int b)
	{
		int result = a - b;
		System.out.println("Substraction result is : "+result);
	}

	/**
	 * This is my method - does division.
	 * Please make sure you are not assigining denominator - b value as zero.
	 * 
	 * @param a
	 * @param b
	 * @throws IOException
	 */
	public void division(int a, int b) 
	{
		int result = a / b;
		System.out.println("Division result is : "+result);
	}
	
}
