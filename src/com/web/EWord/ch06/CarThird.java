package com.web.EWord.ch06;

public class CarThird {

	String name = "아반떼";
	int cc = 1500;
	String color = "White";
	
//	CarThird(String str, int num, String col) {
//		name = str;
//		cc = num;
//		color = col;
//	}
	
	
//	함수의 이름은 같은데 매개변수의 내용이 다른것 : 오버로드
//	기본생성자
	CarThird() {
		
	}
	
//	명시적 생성자
	
//	1. 이름 바꾸기
//	CarThird(String car) {
//		name = car;
//	}
//	아래와 내용 같음
	CarThird(String name) {
		this.name = name;
	}
	
//	2. 이름, cc 바꾸기
//	CarThird(String car, int num) {
//		name = car;
//		cc = num;
//	}
//	아래와 내용 같음
	CarThird(String name, int cc) {
		this.name = name;
		this.cc = cc;
	}
	
//	3. cc와 이름 바꾸기
//	CarThird(int num, String car) {
//		name = car;
//		cc = num;
//	}
//	아래와 내용 같음.
	CarThird(int cc, String name) {
		this.cc = cc;
		this.name = name;
	}
	
//	4. 이름, cc, 색깔 바꾸기.
//	CarThird(String car, int num, String carColor) {
//		name = car;
//		cc = num;
//		color = carColor;
//	}
	CarThird(String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
	CarThird(int ccvalue) {
		cc = ccvalue;
	}
	
//	기본생성자
//	string name;
//	int cc;
//	string color;
//	
//	CarThird() {
//		
//	}
////	1. 이름 바꾸기
//	CarThird(String name) {
//		this.name = name;
//	}
//	
//	
////	2. 이름, cc 바꾸기
//	CarThird(String name, int cc) {
//		this.name = name;
//		this.cc = cc;
//	}
	
//	3. cc와 이름 바꾸기
	
//	4. 이름, cc, 색깔 바꾸기.
	
}
