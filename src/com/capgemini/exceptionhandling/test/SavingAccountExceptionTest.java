package com.capgemini.exceptionhandling.test;

import org.junit.Test;

import com.capgemini.exception.DebitLimitExceeded;
import com.capgemini.exception.LowBalanceException;
import com.capgemini.exceptionhandling.model.SavingAccountException;

public class SavingAccountExceptionTest 
{
	private SavingAccountException account;

	@Test(expected=LowBalanceException.class)
	public void testWithdrawWithSalaryAccountAndInSufficientBalance() throws LowBalanceException, DebitLimitExceeded {
		account = new SavingAccountException(101, "John", 45000, true);
		account.withdraw(50000);
	}

	
	@Test(expected=LowBalanceException.class)
	public void testWithdrawWithNotSalaryAndInSufficientBalance() throws LowBalanceException, DebitLimitExceeded {
		account = new SavingAccountException(101, "John", 45000, false);
		account.withdraw(50000);
	}
}
