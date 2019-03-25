package com.capgemini.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InvalidInputException extends Exception 
{
	public InvalidInputException(String s)
	{
		super(s);
	}
}
