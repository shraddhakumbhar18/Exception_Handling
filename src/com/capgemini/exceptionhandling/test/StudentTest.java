package com.capgemini.exceptionhandling.test;

import org.junit.Test;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;
import com.capgemini.exceptionhandling.model.Student;

public class StudentTest 
{
	@Test(expected = AgeNotWithinRangeException.class)
	public void testToFindAge() throws AgeNotWithinRangeException, NameNotValidException
	{
		Student student = new Student(1,"Shraddha",22,"SoftwareEngg");
	}
	@Test(expected = NameNotValidException.class)
	public void testToFindName() throws NameNotValidException, AgeNotWithinRangeException
	{
		Student student = new Student(1,"Shr@addha",17,"Software");
	}
	
}

