
package com.capgemini.exceptionhandling.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.DebitLimitExceeded;
import com.capgemini.exceptionhandling.model.CurrentAccountException;

public class CurrentAccountExceptionTest 
{

private CurrentAccountException account;
	
	@Before
	public void setUp() 
	{
		account = new CurrentAccountException(101, "John", 45000);
	}


	
	@Test(expected=DebitLimitExceeded.class)
	public void testWithdrawWithDebitLimitExceed() throws DebitLimitExceeded 
	{
		account.withdraw(65000);
		account.withdraw(5000);
	}

}
