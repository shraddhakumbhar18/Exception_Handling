package com.capgemini.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NameNotValidException extends Exception
{
	public NameNotValidException(String s)
	{
		super(s);
	}
}
