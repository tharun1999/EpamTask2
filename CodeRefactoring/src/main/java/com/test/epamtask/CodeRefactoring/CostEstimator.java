package com.test.epamtask.CodeRefactoring;

public class CostEstimator {
	public double calculate_Cost(double area, String standard) {
		double cost = 0;
		if (standard.equals("standard")) {
			cost = area * 1200;
		} else if (standard.equals("abovestandard")) {
			cost = area * 1500;
		} else if (standard.equals("highstandard")) {
			cost = area * 1800;
		} else {
			cost = area * 2500;
		}
		return cost;
	}
}
