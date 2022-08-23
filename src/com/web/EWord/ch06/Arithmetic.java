package com.web.EWord.ch06;

public class Arithmetic {
	
	int sum = 0;
	int subtraction = 0;
	int division = 0;
	int multiplication = 0;
	int Remainder = 0;
	
	public int sum (int a, int b) {
		sum = a + b;
		
		return sum;
	}
	public int subtraction (int a, int b) {
		subtraction = a - b;
		
		return subtraction;
	}
	public int division (int a, int b) {
		division = a * b;
		
		return division;
	}

	public int multiplication (int a, int b) {
		multiplication = a / b;
		
		return multiplication;
	}
	
	public int Remainder (int a, int b) {
		Remainder = a % b;
		
		return Remainder;
	}
	
	public void say(int result) {
		System.out.println("값은 " + result + "입니다.");
	}
	
	String a;
	String b;
	
	public void combine (String a, String b) {
		System.out.println(a + b);
	}
	
	
	
}

