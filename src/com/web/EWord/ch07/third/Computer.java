package com.web.EWord.ch07.third;

public class Computer extends Calculator {


	
//	public double areaCircle(double r) {
//		
//		System.out.println("Calculator 객체의 areaCircle 실행");
//		
//		return 3.14159 * r * r;
//	} 상속이라 이 내용이 자동적으로 들어가 있음.
	
	
	
	@Override
	public double areaCircle(double r) {
		
		System.out.println("Computer 객체의 areaCircle 실행");
		
		return Math.PI * r * r;
	}
	
}
