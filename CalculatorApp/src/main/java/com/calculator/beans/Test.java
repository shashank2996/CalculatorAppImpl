package com.calculator.beans;

public class Test {
	public static void main(String[] args) {
		CalculatorImpl impl=new CalculatorImpl();
		int add=impl.add(10, 20);
		int sub=impl.sub(20, 10);
		int mul=impl.mul(10, 20);
		double div=impl.div(20,10);
		
		System.out.println("add : "+add);
		System.out.println("sub : "+sub);
		System.out.println("mul :"+mul);
		System.out.println("div :"+div);
	}

}
