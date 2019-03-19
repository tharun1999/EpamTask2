package com.test.epamtask.CodeRefactoring;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator test = new Calculator();
	
	@Test
	public void addTest() {
		assertEquals(5.5, test.add(2.2, 3.3), 0.0);
		assertEquals(7.1, test.add(1.1, 2, 4), 0.0);
		assertEquals(-5, test.add(-2.2, -1.3, 5, -6.5), 0.0);
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(7.26, test.multiply(2.2, 3.3), 0.0);
		assertEquals(8.8, test.multiply(1.1, 2, 4), 0.0);
		assertEquals(-92.95, test.multiply(-2.2, -1.3, 5, -6.5), 0.0);
	}
	
	@Test()
	public void divisionTest() {
		assertEquals(0.67, test.divide(2.2, 3.3), 0.0);
		assertEquals(0 , test.divide(1.1, 0), 0.0);
		assertEquals(3.33, test.divide(10, 3), 0.0);
	}

}

