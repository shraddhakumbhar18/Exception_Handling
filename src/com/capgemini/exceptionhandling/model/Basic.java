package com.capgemini.exceptionhandling.model;

public class Basic 
{
	private int a;
	private int b;
	public Basic() {
		super();
	}
	public Basic(int a, int b) {
		super();
		this.a = a;
		this.b = b;
				
		
		try
		{
			int c = a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
	}
	
	
}
