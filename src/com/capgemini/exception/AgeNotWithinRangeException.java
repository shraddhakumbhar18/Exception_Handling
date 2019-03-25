package com.capgemini.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException(String s)
	{
		super(s);
	}
}
