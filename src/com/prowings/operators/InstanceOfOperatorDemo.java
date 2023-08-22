package com.prowings.operators;

public class InstanceOfOperatorDemo {
	
	public static void main(String[] args) {
		
		String s = new String("Hello");
		
		StringBuffer s1 = new StringBuffer("Hii");
		
		StringBuilder s2 = new StringBuilder("HiHello");
		
		
		doSomething(s);
		
	}

	
	public static void doSomething(Object o)
	{
		if(o instanceof String)
		{
			System.out.println("do some String operations!!");
		}
		else
		{
			System.out.println("Its not a string !!");
		}
	}
	
}
