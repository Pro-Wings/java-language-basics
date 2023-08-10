package com.prowings.constructor;

public class B extends A {
	
	int i;
	
	public B()
	{
//		super();this(10); //this is not allowed
		System.out.println("inside B() constructor!!");
	}
	
	public B(int i)
	{
		System.out.println("inside B(int i) constructor!!");
		this.i = i;
	}

}
