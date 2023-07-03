package com.ab.servlet;

public class Test {
	private int a, b;
	
	public Test() {
		System.out.println("0-Param Constructor");
	}
	
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("2-Param Constructor");
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}
