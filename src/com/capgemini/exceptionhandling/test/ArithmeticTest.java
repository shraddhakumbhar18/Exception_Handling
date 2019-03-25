package com.capgemini.exceptionhandling.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.exceptionhandling.model.JUnitMessage;

public class ArithmeticTest 
{
		public String message = "Shraddha";
		
		JUnitMessage junitMessage = new JUnitMessage(message);
		
		@Test(expected = ArithmeticException.class)
		public void testJUnitMessage(){

			System.out.println("Junit Message is printing ");
			junitMessage.printMessage();

		}

		@Test
		public void testJUnitHiMessage(){ 
			message="Hi!" + message;
			System.out.println("Junit Message is printing ");
			assertEquals(message, junitMessage);
		
		}

}
