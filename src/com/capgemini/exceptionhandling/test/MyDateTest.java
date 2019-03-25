package com.capgemini.exceptionhandling.test;

import org.junit.Test;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;
import com.capgemini.exceptionhandling.model.MyDate;

public class MyDateTest 
{
	@Test(expected = InvalidMonthException.class)
	public void testToCheckMonthIsValidOrNot() throws InvalidMonthException, InvalidDayException
	{
		MyDate date = new MyDate(12,10,2018);
		date.dateValidator();
		
	}
	@Test(expected = InvalidDayException.class) 
	public void testToCheckDayIsValidOrNot() throws InvalidDayException , InvalidMonthException
	{
		MyDate date = new MyDate(20,10,2017);
		date.dateValidator();
	}
}
