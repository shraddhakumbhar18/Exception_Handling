package com.capgemini.exceptionhandling.test;

import org.junit.Test;

import com.capgemini.exception.CountryNotValidException;
import com.capgemini.exception.EmployeeNameInvalidException;
import com.capgemini.exception.TaxNotEligibleException;
import com.capgemini.exceptionhandling.model.TaxCalculator;

public class TaxCalculatorTest {

	@Test(expected = CountryNotValidException.class)
	public void testToCalculateValidCountry() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		TaxCalculator employee = new TaxCalculator();
		employee.calculateTax("Ron",false, 34000);
	}
	
	@Test(expected = EmployeeNameInvalidException.class)
	public void testToCheckEmployeeNameValidOrInvalid() throws EmployeeNameInvalidException, CountryNotValidException,TaxNotEligibleException 
	{
		TaxCalculator employee = new TaxCalculator();
		employee.calculateTax("" ,true, 30000);
	}
	
	@Test(expected = TaxNotEligibleException.class)
	public void testToCheckEligibilityForTax() throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException
	{
		TaxCalculator employee = new TaxCalculator();
		employee.calculateTax("Tim" ,true,1000 );
		employee.calculateTax("Jack", true, 55000);
	}
}
