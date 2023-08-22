package com.prowings.operators;

public class TestRelationalOperator3 {
	
	public static void main(String[] args) {

		int x = 10;
		
//increement
		
		System.out.println(++x); //prefix - first value will get increased then exp evalutes
//		System.out.println(x++); //postfix - first exp will get evaluated then value increments


//decreement
//		System.out.println(--x); //prefix - first value will get decrease then exp evalutes
		System.out.println(x--); //postfix - first exp will get evaluated then value decrements
		
		System.out.println(x);
		
		
		
	}

}
