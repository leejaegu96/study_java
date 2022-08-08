package com.web.EWord.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		int grade = 4;
		int price = 10000;
		
		if (grade == 1) {
			System.out.println((int)(price*(1-0.05)) + "원");
		} else if (grade == 2) {
			System.out.println((int)(price*(1-0.1)) + "원");
		} else if (grade == 3) {
			System.out.println((int)(price*(1-0.15)) + "원");
		} else if (grade == 4) {
			System.out.println((int)(price*(1-0.2)) + "원");
		} else if (grade == 5) {
			System.out.println((int)(price*(1-0.27)) + "원");
		} else {
			System.out.println(" ");
		}
		
	}

}
