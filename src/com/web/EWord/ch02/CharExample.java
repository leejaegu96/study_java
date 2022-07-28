package com.web.EWord.ch02;

public class CharExample {

	public static void main(String[] args) {

//		자바는 모든 문자를 유니코드로 처리함.
//		국제 표준 규약
		
		char c1 = 'A';				//  문자를 저장
		char c2 = 65;				//  십진수로 저장
		char c3 = '\u0041';			//  16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	
		int uniCode = c1;
		System.out.println(uniCode);
		
		int uniCode2 = c4;
		System.out.println(c4);
		
		int uniCode3 = c4;
		System.out.println(uniCode3);
	}

}
