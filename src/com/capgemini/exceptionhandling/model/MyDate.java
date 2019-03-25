package com.capgemini.exceptionhandling.model;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;

public class MyDate {
	private int date;
	private int month;
	private int year;

	public MyDate() {
		super();
	}

	public MyDate(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public void dateValidator() throws InvalidMonthException, InvalidDayException {
		if (!(month >= 1 && month <= 12)) {
			throw new InvalidMonthException("Invalid month");
		}
		if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
			if (!(date == 29 && month == 2)) {
				throw new InvalidDayException("Invalid Day");
			} else if (month == 2) {
				if (date > 28) {
					throw new InvalidDayException("Invalid Day");
				}
			}
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (date > 31) {
					throw new InvalidDayException("Invalid Day");
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (date > 30) {
					throw new InvalidDayException("Invalid Day");
				}
			}
		}

	}
}
