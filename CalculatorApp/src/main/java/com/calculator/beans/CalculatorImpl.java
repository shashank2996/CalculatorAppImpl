package com.calculator.beans;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

	@Override
	public int sub(int c, int d) {
		int sub=c-d;
		return sub;
	}

	@Override
	public int mul(int e, int f) {
		int mul=e*f;
		return mul;
	}

	@Override
	public double div(int g, int h) {
		double div=g/h;
		return div;
	}

}
