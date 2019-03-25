package com.capgemini.exceptionhandling.model;

import com.capgemini.exception.CountryNotValidException;
import com.capgemini.exception.EmployeeNameInvalidException;
import com.capgemini.exception.TaxNotEligibleException;

public class TaxCalculator
{
	private String employeeName;
	private boolean isIndian;
	private double employeeSalary;
	private double taxAmount;
	
	public TaxCalculator() 
	{
		super();
		
	}

	
	public double calculateTax(String employeeName, boolean isIndian, double employeeSalary) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		if(employeeName == null || employeeName.isEmpty())
		{
			throw new EmployeeNameInvalidException("Name not valid");
		}
			
		if(isIndian)
		{
			double taxAmount ;
			if(employeeSalary >= 100000)
			{
				taxAmount = employeeSalary * 8/100;
			}
			else if(employeeSalary >= 50000 && employeeSalary <= 1000000)
			{
				taxAmount = employeeSalary * 6/100;
			}
			else if(employeeSalary >= 30000 && employeeSalary <= 50000)
			{
				taxAmount = employeeSalary * 5/100;
			}
			else if(employeeSalary >= 10000 && employeeSalary <= 30000)
			{
				taxAmount = employeeSalary * 4/100;
			}
			else
			{
				throw new TaxNotEligibleException("Tax not eligible");
			}
		}
		else
		{
			throw new CountryNotValidException("Country not valid");
		}
		return taxAmount;
	}

	public double getTaxAmount() 
	{
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount)
	{
		this.taxAmount = taxAmount;
	}
	
	
}
