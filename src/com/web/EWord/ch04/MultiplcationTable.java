package com.web.EWord.ch04;

public class MultiplcationTable {

	public static void main(String[] args) {

//		2단 출력 프로그램
		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("2 * " + i + " = " + (2*i));
//		}
		
		// 2단 부터 9단 까지 출력하는 프로그램 작성 : 6줄 이상 되지 않게.
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
				if(j == 9) {
				System.out.println("---------------------");
				}
			}
		}
	}

}