package com.capgemini.exceptionhandling.test;

import org.junit.Test;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;
import com.capgemini.exceptionhandling.model.Factorial;

public class FactorialTest 
{
	@Test(expected = InvalidInputException.class)
	public void testGetFactorial() throws InvalidInputException, FactorialException
	{
		Factorial factorial = new Factorial();
		factorial.getFactorial(1);
	}
	
	@Test(expected = FactorialException.class)
	public void testGetFactorial() throws FactorialException
	{
		Factorial factorial = new Factorial();
		factorial.getFactorial(1);
	}

}
