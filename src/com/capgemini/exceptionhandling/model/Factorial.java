package com.capgemini.exceptionhandling.model;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

public class Factorial extends Exception
{
	private int number;

	public Factorial() 
	{
		super();
		
	}
	
	public int getFactorial(int number) throws InvalidInputException,FactorialException
	{
		int factorial = 1 ;
		if(number<2)
		{
			throw new InvalidInputException("Invalid Input Exception");
		}
		else 
		{
			for(int i=1 ; i <=number ; i++)
			{
				factorial= factorial * i;
			}
			if(factorial > Integer.MAX_VALUE)
			{
				throw new FactorialException("Factorial Exception");
			}
		}
		return factorial;
	}
}
