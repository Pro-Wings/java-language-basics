package com.prowings.operators;

public class TestOperator {
	
	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		
		boolean res1 = (a < b) && (b > a); //  true && true - true
 		
		boolean res2 = (a > b) && (b > a); //false && true  - false
		
		boolean res3 = (a < b) && (b < a); // true && false - false
		
		boolean res4 = (a > b) && (b < a); //false && false - false
		
		
		boolean res5 = !(a > b);
		
		System.out.println("res 5 : "+ res5);
		
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

	}

}
