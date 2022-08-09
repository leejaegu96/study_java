package com.web.EWord.ch04;

public class IfExample3 {

	public static void main(String[] args) {

		int value1 = 18;
		int value2 = 16;
		
		if (value1 > value2) {
			System.out.println("value1이 value2보다 크다");
		} else if (value1 == value2) {
			System.out.println("value1과 value2가 같다.");
		} else if (value1 < value2) {
			System.out.println("value1보다 value2가 크다.");
		} else {
			System.out.println("값을 다시 지정하여 주십시오.");
		}
		
	}

}
