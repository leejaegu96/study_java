package com.web.EWord.test;

import java.util.Scanner;

public class test03 {
	
	public static String solution(String str) {
		
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
		}
		return answer;
	}
	
	

	public static void main(String[] args) {
		
//		test03 T = new test03();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		System.out.println(solution(str));
		
	}
	
}
