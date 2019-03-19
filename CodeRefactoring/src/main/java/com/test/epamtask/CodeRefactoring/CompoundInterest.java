package com.test.epamtask.CodeRefactoring;

public class CompoundInterest {
	public double compoundInterest(double principal, double rate, int time) {
		double compound_interest = 0;
		compound_interest = principal * Math.pow((1 + (rate / 100)), time);
		return Math.round(compound_interest * 100.0) / 100.0;
	}
}