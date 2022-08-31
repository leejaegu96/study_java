package com.web.EWord.test;

import java.util.Scanner;

public class test03 {
	
	public static int solution(String str) {
		
		int answer = 0;
		for(int i=0; i<str.length();i++) {
			answer += 1;
		}
		
		return answer;
	}
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(test03.solution(str));
		
	}
	
}
