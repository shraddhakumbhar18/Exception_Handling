package com.capgemini.exceptionhandling.model;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.FactorialException;
import com.capgemini.exception.NameNotValidException;

public class Student 
{
	private int rollNo;
	private String studentName;
	private int age;
	private String studentCourse;
	
	public Student() 
	{
		super();
	}

	public Student(int rollNo, String studentName, int age, String studentCourse) throws AgeNotWithinRangeException, NameNotValidException 
	{
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.age = age;
		this.studentCourse = studentCourse;
		
		if(!(age > 15 && age < 21))
		{
			throw new AgeNotWithinRangeException("Age is not in range");
		}
		
		if(!(studentName.matches("^[a-zA-Z]*$")))
		{
			throw new NameNotValidException("Name is not valid");
		}
	
	}
	
}
