package com.prowings.operators;

public class TestRelationalOperator2 {
	
	public static void main(String[] args) {

		Integer a = new Integer(127);
		Integer b = 127;
		
		boolean res = a == b;
		System.out.println(res);
		
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1 == s2);
		
		
		int x = 5;
		int y = 10;
		
		boolean res1 = (x < y) && (y > x); //T||T
		boolean res2 = (x < y) && (y < x); //T||F
		boolean res3 = (x > y) && (y > x); //F||T
		boolean res4 = (x > y) && (y < x); //F||F
		
		System.out.println("T && T  :"+res1);
		System.out.println("T && F  :"+res2);
		System.out.println("F && T  :"+res3);
		System.out.println("F && F  :"+res4);

		boolean res5 = (x < y) || (y > x); //T||T
		boolean res6 = (x < y) || (y < x); //T||F
		boolean res7 = (x > y) || (y > x); //F||T
		boolean res8 = (x > y) || (y < x); //F||F
		
		System.out.println("T || T  :"+res5);
		System.out.println("T || F  :"+res6);
		System.out.println("F || T  :"+res7);
		System.out.println("F || F  :"+res8);
		
	}

}
