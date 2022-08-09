package com.web.EWord.ch04;

public class IfExample4 {

	public static void main(String[] args) {

//		int value = 0;
//		
//		if(value % 2 == 1) {
//			System.out.println("value의 값은 홀수입니다.");
//		} else if(value % 2 == 0) {
//			System.out.println("value의 값은 짝수입니다.");
//		} else if(value == 0) {
//			System.out.println("0은 홀짝을 판단할 수 없습니다.");
//		} else {
//			System.out.println("값을 확인하여 주십시오.");
//		}
		
		int a = 0;
		
		if(a != 0) {
			if(a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
//			a==0
			System.out.println("0은 홀짝을 판단할 수 없습니다.");
		}
		
	}

}
