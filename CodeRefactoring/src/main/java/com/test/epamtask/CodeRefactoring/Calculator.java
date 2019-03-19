package com.test.epamtask.CodeRefactoring;

public class Calculator {
	public double add (double... a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public double multiply (double... a) {
		double product = 1;
		for (int i = 0; i < a.length; i++) {
			product *= a[i];
		}
		return product;
	}
	
	public double divide (double a, double b) {
		if (b == 0) {
			return 0;
		}
		double quotient = a / b;
		quotient = Math.round(quotient*100.0) / 100.0;
		return quotient;
	}
}

