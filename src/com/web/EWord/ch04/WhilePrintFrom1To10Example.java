package com.web.EWord.ch04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {

		int i=1;
		int sum = 0;
		
		while (i <= 10) {
			sum = sum + i;
			System.out.println(i + " : " + sum);
			i++;
		}
		
	}

}
