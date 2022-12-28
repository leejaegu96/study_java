package com.web.EWord.test1;

public class test1228 {

	public static void main(String[] args) {
		
		// 1~10 중 홀수를 다 더한 수를 구해라.
		int total = 0;
		
		for(int i=0; i<10; i++) {
			if(i%2==1) {
				total += i;
			}
		}
		System.out.println(total);
		
		double a = 0.1;
		double b = 0.2;
		
		System.out.println(a+b==0.3);
		
		
	}

}
