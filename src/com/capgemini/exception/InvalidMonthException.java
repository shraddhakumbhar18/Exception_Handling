package com.capgemini.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InvalidMonthException extends Exception
{
	public InvalidMonthException(String s)
	{
		super(s);
	}
}
