package com.web.EWord.ch04;

public class IfExample5 {

	public static void main(String[] args) {

		int a = -5;
		int b = 5;
		
		if (a > 0 && b > 0) {
			System.out.println("a와 b는 제1사분면 입니다.");
		} else if (a < 0 && b > 0) {
			System.out.println("a와 b는 제2사분면 입니다.");
		}  else if (a < 0 && b < 0) {
			System.out.println("a와 b는 제3사분면 입니다.");
		} else if (a > 0 && b < 0) {
			System.out.println("a와 b는 제4사분면 입니다.");
		} else if (a == 0 && b < 0 || b > 0){
//			b!=0
			System.out.println("a와 b는 y축에 있습니다.");
		} else if (a > 0 || a < 0 && b == 0){
			System.out.println("a와 b는 x축에 있습니다.");
		} else {
//			a==0 && b==0
			System.out.println("a와 b는 영점에 있습니다.");
		}
		
	}

}
