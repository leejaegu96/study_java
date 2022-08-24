package com.web.EWord.ch06;

public class Korean {
	
	String name = "이재구";
	String ssn = "961211-1234567";
	int age = 27;
	
	Korean() {
		
	}
	
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static String nationality = "대한민국";
	
	static int staticTest (int a) {
		return a + 10;
	}
	
	int ttest () {
		Arithmetic arithmetic = new Arithmetic();
		
		arithmetic.aaa(12);
		
		return 1;
	}
	
	public void ttest2 () {
		Arithmetic.staticTest();
	}
}
